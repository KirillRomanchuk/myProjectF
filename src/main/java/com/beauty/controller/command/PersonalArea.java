package com.beauty.controller.command;

import com.beauty.model.entity.enums.Role;
import com.beauty.view.View;
import com.beauty.view.ViewModel;

import javax.servlet.http.HttpServletRequest;

public class PersonalArea implements Command {

    @Override
    public View execute(HttpServletRequest request) {
        Role role = (Role) request.getSession().getAttribute("role");
        return new ViewModel(role.getUrl);
    }
}
