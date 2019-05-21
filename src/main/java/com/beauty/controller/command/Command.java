package com.beauty.controller.command;

import com.beauty.component.WebComponentInitializer;
import com.beauty.view.View;

import javax.servlet.http.HttpServletRequest;

public interface Command {
    View execute(HttpServletRequest request);
}
