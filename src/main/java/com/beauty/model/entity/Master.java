package com.beauty.model.entity;

public class Master {
    private int id;
    private User user;
    private String service;

    /*public Master(User user) {
        this.user = user;
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
}
