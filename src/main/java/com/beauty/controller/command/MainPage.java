package com.beauty.controller.command;

import com.beauty.view.View;
import com.beauty.view.ViewModel;

import javax.servlet.http.HttpServletRequest;

public class MainPage implements Command{
    @Override
    public View execute(HttpServletRequest request) {
        return new ViewModel( "/main.jsp");
    }
}
