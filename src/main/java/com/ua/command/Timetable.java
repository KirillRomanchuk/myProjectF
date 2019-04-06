package com.ua.command;

import javax.servlet.http.HttpServletRequest;

public class Timetable implements Command{
    @Override
    public String execute(HttpServletRequest request) {
        return "/WEB-INF/timetable.jsp";
    }
}
