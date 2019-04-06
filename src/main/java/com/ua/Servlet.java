package com.ua;

import com.ua.command.*;
import com.ua.command.Exception;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Servlet extends HttpServlet {
    private Map<String, Command> commands = new HashMap<>();

    public void init() {
        commands.put("logout", new LogOut());
        commands.put("login", new Login());
        commands.put("registration", new Registration());
        commands.put("exception", new Exception());
        commands.put("timetable", new Timetable());
        commands.put("feedback", new Feedback());
        commands.put("registrationService", new RegistrationService());
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        processRequest(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getRequestURI();
//        System.out.println(path);
        path = path.replaceAll(".*/app/", "");
//        System.out.println(path);
        Command command = commands.getOrDefault(path, (r) -> "/index.jsp)");
        String page = command.execute(request);
        if (page.contains("redirect")) {
            response.sendRedirect(page.replace("redirect:", "/app"));
        } else {
            request.getRequestDispatcher(page).forward(request, response);
        }
    }
}