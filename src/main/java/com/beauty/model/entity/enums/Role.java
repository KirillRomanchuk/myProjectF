package com.beauty.model.entity.enums;

public enum Role {
    ADMIN("admin/personal_area", "/WEB-INF/admin/personal_area.jsp"),
    MASTER("master/personal_area", "/WEB-INF/admin/personal_area.jsp"),
    USER("user/personal_area", "/WEB-INF/admin/personal_area.jsp"),
    UNKNOWN("main", "main.jsp");

    public final String url;
    public final String getUrl;

    private Role(String url, String getUrl) {
        this.url = url;
        this.getUrl = getUrl;
    }
}