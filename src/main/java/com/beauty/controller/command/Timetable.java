package com.beauty.controller.command;

import com.beauty.view.View;
import com.beauty.view.ViewModel;

import javax.servlet.http.HttpServletRequest;

public class Timetable implements Command{
    @Override
    public View execute(HttpServletRequest request) {
        return new ViewModel( "/WEB-INF/timetable.jsp");
    }
}
