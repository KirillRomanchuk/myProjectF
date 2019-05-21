package com.beauty.servlet;

import com.beauty.controller.command.*;
import com.beauty.controller.command.Exception;
import com.beauty.controller.command.registration.*;
import com.beauty.component.WebComponentInitializer;
import com.beauty.view.RedirectViewModel;
import com.beauty.view.View;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class RequestResolver {

    private static final String VIEW_ATTRIBUTE = "VIEW_ATTRIBUTE";

    private Map<String, Function<HttpServletRequest, View>> getControllers = new HashMap<>();
    private Map<String, Function<HttpServletRequest, View>> postControllers = new HashMap<>();

    public RequestResolver(WebComponentInitializer webComponentInitializer) {
        getControllers.put("/main", r -> new MainPage().execute(r));
        getControllers.put("/logout", r -> new LogOut().execute(r));
        getControllers.put("/login", r -> new Login().execute(r));
        getControllers.put("/registration", r -> new Registration().execute(r));
        getControllers.put("/exception", r -> new Exception().execute(r));
        getControllers.put("/timetable", r -> new Timetable().execute(r));
        getControllers.put("/feedback", r -> new Feedback().execute(r));
        getControllers.put("/admin/personal_area", r -> new PersonalArea().execute(r));
        getControllers.put("/master/personal_area", r -> new PersonalArea().execute(r));
        getControllers.put("/user/personal_area", r -> new PersonalArea().execute(r));

        postControllers.put("/login", r -> new UserLogin(webComponentInitializer.getUserService(), webComponentInitializer.getUserLoginConverter()).execute(r));
        postControllers.put("/registrationService", r -> new DoRegistration(webComponentInitializer.getUserService(), webComponentInitializer.getUserConverter()).execute(r));
        postControllers.put("/change_language", r -> new ChangeLanguage().execute(r));
    }

    public void resolveGetRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        reference(request, response, getControllers);
    }

    public void resolvePostRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        reference(request, response, postControllers);
    }

    private void reference(HttpServletRequest request, HttpServletResponse response, Map<String, Function<HttpServletRequest, View>> controller) throws IOException, ServletException {
        try {
            reference(getView(request, controller), request, response);
        } catch (java.lang.Exception e) {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/error.jsp");
            request.setAttribute("error", e);
            requestDispatcher.forward(request, response);
        }
    }

    private void reference(View view, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if (view instanceof RedirectViewModel) {
            request.getSession().setAttribute(VIEW_ATTRIBUTE, view.getView());
            response.sendRedirect(view.getPageUrl());
        } else if (view != null) {
            view.getParameters().forEach(request::setAttribute);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/" + view.getPageUrl());
            requestDispatcher.forward(request, response);
        }
    }

    private View getView(HttpServletRequest request, Map<String, Function<HttpServletRequest, View>> sourceController) {
        String requestURI = request.getRequestURI().replace(request.getContextPath() + "/beautyhole", "");

        View originView = (View) request.getSession().getAttribute(VIEW_ATTRIBUTE);
        request.getSession().removeAttribute(VIEW_ATTRIBUTE);

        View destinationView = Optional.ofNullable(sourceController.get(requestURI)).map(f -> f.apply(request)).orElse(null);
        if (originView != null && destinationView != null) {
            originView.getParameters().forEach(destinationView::addParameter);
        }
        return destinationView;
    }
}
