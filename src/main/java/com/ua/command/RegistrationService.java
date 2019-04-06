package com.ua.command;

import javax.servlet.http.HttpServletRequest;

public class RegistrationService implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        return "/WEB-INF/registrationService.jsp";
    }
}
