package com.beauty.model.converter;

import com.beauty.model.entity.User;
import com.beauty.model.entity.enums.Role;

import javax.servlet.http.HttpServletRequest;

public class UserConverter implements Converter <HttpServletRequest, User> {
    @Override
    public User convert(HttpServletRequest request) {
        User user = new User();
        user.setLogin(request.getParameter("login"));
        user.setPassword(request.getParameter("password"));
        user.setRole(Role.USER);
        user.setLastName(request.getParameter("lastName"));
        user.setFirstName(request.getParameter("firstName"));
        user.setEmail(request.getParameter("email"));
        user.setPhone(Integer.valueOf(request.getParameter("phone")));
        return user;
    }
}
