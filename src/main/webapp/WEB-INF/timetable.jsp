<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setLocale value="${sessionScope.lang}"/>
<fmt:setBundle basename="messages"/>

<html lang="${sessionScope.lang}">
<head>
    <title>TIMETABLE</title>
</head>
<body>
<h2>
    timetable
</h2>
<br>
<a href="${pageContext.request.contextPath}/main.jsp">Logout</a>
<br>
<a href="${pageContext.request.contextPath}/beautyhole/registrationService">get service</a>
<br>
<a href="${pageContext.request.contextPath}/beautyhole/feedback">feedback</a>
</body>
</html>
