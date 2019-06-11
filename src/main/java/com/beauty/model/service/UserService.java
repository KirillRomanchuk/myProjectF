package com.beauty.model.service;

import com.beauty.model.dao.UserDao;
import com.beauty.model.entity.User;
import com.beauty.model.entity.enums.Role;
import com.google.protobuf.ServiceException;

import java.util.List;

public class UserService {

    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public User loginUser(User userData) throws ServiceException {
        try {
            return this.userDao.findUserByEmailAndPassword(userData.getEmail(), userData.getPassword());
        } catch (Exception e) {
            throw new ServiceException("Login or password is not correct", e);
        }
    }

    public void createUser(User user) throws ServiceException {
        try {
            this.userDao.createUser(user);
        } catch (Exception e) {
            throw new ServiceException("Registration failed", e);
        }
    }

    public Role receiveUserRole(User userData) {
        User user = this.userDao.findUserByEmailAndPassword(userData.getEmail(), userData.getPassword());
        return user != null ? user.getRole() : Role.UNKNOWN;
    }

    public int receiveUserId(User userData) {
        User user = this.userDao.findUserByEmailAndPassword(userData.getEmail(), userData.getPassword());
        return user.getId();
    }

    public List<User> getUserList() {
        return userDao.findAll();
    }

}
