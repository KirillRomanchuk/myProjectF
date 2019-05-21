package com.beauty.controller.command;

import com.beauty.view.RedirectViewModel;
import com.beauty.view.View;
import com.beauty.view.ViewModel;

import javax.servlet.http.HttpServletRequest;

public class LogOut implements Command {
    @Override
    public View execute(HttpServletRequest request) {
        View view = new ViewModel( "main");
        return new RedirectViewModel(view);
    }
}