package com.beauty.model.entity.enums;

public enum Role {
    ADMIN("admin/personal_area", "/WEB-INF/admin/personal_area.jsp", "/WEB-INF/admin/timetable.jsp"),
    MASTER("master/personal_area", "/WEB-INF/master/personal_area.jsp", "/WEB-INF/master/timetable.jsp"),
    USER("user/personal_area", "/WEB-INF/user/personal_area.jsp", "/WEB-INF/user/timetable.jsp"),
    UNKNOWN("main", "main.jsp", "");

    public final String url;
    public final String getUrl;
    public final String timeTableUrl;

    Role(String url, String getUrl, String timeTableUrl) {
        this.url = url;
        this.getUrl = getUrl;
        this.timeTableUrl = timeTableUrl;
    }
}