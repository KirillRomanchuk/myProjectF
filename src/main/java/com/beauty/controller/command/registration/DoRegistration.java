package com.beauty.controller.command.registration;

import com.beauty.controller.command.Command;
import com.beauty.model.converter.UserConverter;
import com.beauty.model.entity.User;
import com.beauty.model.service.UserService;
import com.beauty.view.RedirectViewModel;
import com.beauty.view.View;
import com.beauty.view.ViewModel;
import com.google.protobuf.ServiceException;

import javax.servlet.http.HttpServletRequest;

public class DoRegistration implements Command {

    private final UserService userService;
    private final UserConverter userConverter;

    public DoRegistration(UserService userService, UserConverter userConverter) {
        this.userService = userService;
        this.userConverter = userConverter;
    }

    @Override
    public View execute(HttpServletRequest request) {
        return new RedirectViewModel(createUser(userConverter.convert(request)));
    }

    private View createUser(User user) {
        View view;
        try {
            userService.createUser(user);
            view = new ViewModel("login");
        } catch (ServiceException e) {
            view = new ViewModel("registration");
            view.addParameter("Error", e.getCause() == null ? e.getMessage() : e.getCause().getMessage());
        }
        return view;
    }
}
