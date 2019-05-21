package com.beauty.controller.command;

import com.beauty.view.View;
import com.beauty.view.ViewModel;

import javax.servlet.http.HttpServletRequest;

public class Login implements Command {
    @Override
    public View execute(HttpServletRequest request) {
        return new ViewModel( "/login.jsp");
    }
}
