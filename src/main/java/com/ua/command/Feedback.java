package com.ua.command;

import javax.servlet.http.HttpServletRequest;

public class Feedback implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        return "/WEB-INF/feedback.jsp";
    }
}
