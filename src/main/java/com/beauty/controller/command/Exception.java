package com.beauty.controller.command;

import com.beauty.view.View;

import javax.servlet.http.HttpServletRequest;

public class Exception implements Command {
    @Override
    public View execute(HttpServletRequest request) {
        throw new RuntimeException("Generated exception");
    }
}
