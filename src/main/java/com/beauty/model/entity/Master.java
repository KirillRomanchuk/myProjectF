package com.beauty.model.entity;

public class Master {
    private int id;
    private User user;
    private String service;
    private String firstName;
    private String lastName;

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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String last_name) {
        this.lastName = last_name;
    }
}
