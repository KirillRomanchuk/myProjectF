<%@ page import="com.beauty.component.UserAuthorization" %>
<%@ page import="com.beauty.model.entity.enums.Role" %>
<%@ page import="java.util.Map" %>
<?xml version="1.0" encoding="UTF-8" ?>
<%@ page session="true" isELIgnored="false" contentType="text/html; charset=UTF-8" language="java"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setLocale value="${sessionScope.lang}"/>

<fmt:setBundle basename="messages"/>

<c:set var='role' value="${sessionScope['role']}"/>
<c:set var='roleAdmin' value="${sessionScope['roleADMIN']}"/>
<c:set var='roleUser' value="${sessionScope['roleUSER']}"/>
<c:set var='roleMaster' value="${sessionScope['roleMASTER']}"/>
<c:set var='roleUNKNOWN' value="${sessionScope['roleUNKNOWN']}"/>

<!doctype html>
<html lang="${sessionScope.lang}">
<head>
    <style>
        <%@include file='/css/starter-template.css' %>
    </style>
</head>

<body>
<header>
    <%--    ${sessionScope.lang}--%>
    <!-- Fixed navbar -->
    <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse"
                aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarCollapse">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <c:if test="${role.equals(roleUNKNOWN)}">
                        <a class="nav-link" href="${pageContext.request.contextPath}/beautyhole/main" role="button">
                            <fmt:message
                                    key="local.home"/> <span class="sr-only">(current)</span></a>
                    </c:if>
                    <c:if test="${role.equals(roleAdmin)}">
                        <a class="nav-link" href="${pageContext.request.contextPath}/beautyhole/admin/personal_area"
                           role="button"> <fmt:message
                                key="local.home"/> <span class="sr-only">(current)</span></a>
                    </c:if>
                    <c:if test="${role.equals(roleMaster)}">
                        <a class="nav-link" href="${pageContext.request.contextPath}/beautyhole/master/personal_area"
                           role="button"> <fmt:message
                                key="local.home"/> <span class="sr-only">(current)</span></a>
                    </c:if>
                    <c:if test="${role.equals(roleUser)}">
                        <a class="nav-link" href="${pageContext.request.contextPath}/beautyhole/user/personal_area"
                           role="button"> <fmt:message
                                key="local.home"/> <span class="sr-only">(current)</span></a>
                    </c:if>
                </li>
                <li class="nav-item active">
                    <c:if test="${role.equals(roleAdmin)}">
                        <a class="nav-link" href="${pageContext.request.contextPath}/beautyhole/admin/timetable"
                           role="button"> <fmt:message
                                key="local.timetable"/> <span class="sr-only">(current)</span></a>
                    </c:if>
                    <c:if test="${role.equals(roleMaster)}">
                        <a class="nav-link" href="${pageContext.request.contextPath}/beautyhole/master/timetable"
                           role="button"> <fmt:message
                                key="local.timetable"/> <span class="sr-only">(current)</span></a>
                    </c:if>
                    <c:if test="${role.equals(roleUser)}">
                        <a class="nav-link" href="${pageContext.request.contextPath}/beautyhole/user/timetable"
                           role="button"> <fmt:message
                                key="local.timetable"/> <span class="sr-only">(current)</span></a>
                    </c:if>
                </li>
                <c:if test="${role.equals(roleAdmin)}">
                    <li>

                        <a class="nav-link" href="${pageContext.request.contextPath}/beautyhole/admin/user_list"
                           role="button"> <fmt:message
                                key="local.admin.bar.users"/> <span class="sr-only">(current)</span></a>

                    </li>
                </c:if>
            </ul>


            <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                    <form role="form" method="post"
                          action="${pageContext.request.contextPath}/beautyhole/change_language"
                          class="form-inline mt-2 mt-md-0">
                        <input class="btn btn-outline-success my-2 my-sm-0" type="hidden" name="language" value="en">
                        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">EN</button>
                    </form>
                </li>
                <li class="nav-item">
                    <form role="form" method="post"
                          action="${pageContext.request.contextPath}/beautyhole/change_language"
                          class="form-inline mt-2 mt-md-0">
                        <input class="btn btn-outline-success my-2 my-sm-0" type="hidden" name="language" value="uk">
                        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">UA</button>
                    </form>
                </li>
            </ul>


            <form class="form-inline mt-2 mt-md-0">
                <ul class="navbar-nav mr-auto">

                    <c:choose>
                        <c:when test="${role.equals(roleUNKNOWN)}">
                            <li class="nav-item">
                                <a class="btn btn-outline-success my-2 my-sm-0"
                                   href="${pageContext.request.contextPath}/beautyhole/login"><fmt:message
                                        key="local.log.in"/></a>
                            </li>
                            <li class="nav-item">
                                <a class="btn btn-outline-success my-2 my-sm-0"
                                   href="${pageContext.request.contextPath}/beautyhole/registration"><fmt:message
                                        key="local.registration"/></a>
                            </li>
                        </c:when>
                        <c:otherwise>
                            <li class="nav-item">
                                <a class="btn btn-outline-success my-2 my-sm-0"
                                   href="${pageContext.request.contextPath}/beautyhole/logout"><fmt:message
                                        key="local.logout"/></a>
                            </li>
                        </c:otherwise>
                    </c:choose>
                </ul>
            </form>
        </div>
    </nav>
</header>
</body>
</html>