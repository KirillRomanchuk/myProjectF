package com.ua.command;

import javax.servlet.http.HttpServletRequest;

public class Login implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        return "/login.jsp";
    }
}
