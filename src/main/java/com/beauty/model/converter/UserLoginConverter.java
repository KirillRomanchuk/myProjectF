package com.beauty.model.converter;

import com.beauty.model.entity.User;

import javax.servlet.http.HttpServletRequest;

public class UserLoginConverter implements Converter <HttpServletRequest, User> {
    @Override
    public User convert(HttpServletRequest request) {
        User user = new User();
        user.setEmail(request.getParameter("email"));
        user.setPassword(request.getParameter("password"));
        return user;
    }
}
