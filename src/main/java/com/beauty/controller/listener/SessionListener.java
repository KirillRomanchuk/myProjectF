package com.beauty.controller.listener;

import com.beauty.component.UserAuthorization;
import com.beauty.model.entity.enums.Role;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.HashMap;
import java.util.Map;

public class SessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        ServletContext servletContext = httpSessionEvent.getSession().getServletContext();
        Map<String, UserAuthorization> usersAuthorization = (HashMap<String, UserAuthorization>) servletContext.getAttribute("usersAuthorization");
        usersAuthorization.remove(httpSessionEvent.getSession().getId());
        httpSessionEvent.getSession().setAttribute("role", Role.UNKNOWN);
    }
}
