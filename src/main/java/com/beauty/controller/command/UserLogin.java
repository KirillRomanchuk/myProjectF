package com.beauty.controller.command;

import com.beauty.model.converter.UserLoginConverter;
import com.beauty.model.entity.User;
import com.beauty.model.entity.enums.Role;
import com.beauty.model.service.UserService;
import com.beauty.view.RedirectViewModel;
import com.beauty.view.View;
import com.beauty.view.ViewModel;
import com.google.protobuf.ServiceException;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class UserLogin implements Command {

    private final UserService userService;
    private final UserLoginConverter userLoginConverter;

    public UserLogin(UserService userService, UserLoginConverter userLoginConverter) {
        this.userService = userService;
        this.userLoginConverter = userLoginConverter;
    }

    @Override
    public View execute(HttpServletRequest request) {
        return new RedirectViewModel(loginUser(userLoginConverter.convert(request)));
    }

    public View loginUser(User userData) {
        View view;
        try {
            User user = userService.loginUser(userData);
            view = new ViewModel(user.getRole().url);
        } catch (ServiceException e) {
            view = new ViewModel("login");
            view.addParameter("Error", e.getCause() == null ? e.getMessage() : e.getCause().getMessage());
        }
        return view;
    }
}
