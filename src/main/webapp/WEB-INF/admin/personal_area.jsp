<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setLocale value="${sessionScope.lang}"/>
<fmt:setBundle basename="messages"/>

<html lang="${sessionScope.lang}">
<t:genericpage>
    <jsp:attribute name="title">
      Template Page
    </jsp:attribute>
    <jsp:attribute name="header">
      <jsp:include page="/WEB-INF/headerfooter/header.jsp"/>
    </jsp:attribute>
    <jsp:attribute name="footer">
      <p id="copyright"></p>
    </jsp:attribute>

    <jsp:body>
        <div class="row">
            <div class="col-sm-4">
                <p></p>
            </div>
        </div>
    </jsp:body>
</t:genericpage>
</html>
<%--
<%@ page language="java" isErrorPage="true" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*, java.text.*" %>

<html>
<body>
<h2>
  index!
</h2>

<br>
<a href="${pageContext.request.contextPath}/app/login">Login</a>
<br>
<a href="${pageContext.request.contextPath}/app/registration">Registration form</a>
<br>
<a href="${pageContext.request.contextPath}/app/timetable">Time table</a>
<br>
<a href="${pageContext.request.contextPath}/app/exception">Exception</a>

</body>
</html>--%>
