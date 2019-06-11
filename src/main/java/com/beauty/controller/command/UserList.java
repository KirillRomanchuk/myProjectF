package com.beauty.controller.command;

import com.beauty.model.entity.User;
import com.beauty.model.service.UserService;
import com.beauty.view.View;
import com.beauty.view.ViewModel;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class UserList implements Command{
    private final UserService userService;

    public UserList(UserService userService) {
        this.userService = userService;
    }

    @Override
    public View execute(HttpServletRequest request) {
        return userList();
    }

    public View userList() {
        View view;
        List<User> userList = userService.getUserList();
        view = new ViewModel("/WEB-INF/admin/user_list.jsp");
        view.addParameter("userList", userList);
        return view;
    }
}
