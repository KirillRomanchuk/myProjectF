package com.beauty.controller.command.registration;

import com.beauty.controller.command.Command;
import com.beauty.view.View;
import com.beauty.view.ViewModel;

import javax.servlet.http.HttpServletRequest;

public class Registration implements Command {
    @Override
    public View execute(HttpServletRequest request) {
        return new ViewModel( "/registration.jsp");
    }
}
