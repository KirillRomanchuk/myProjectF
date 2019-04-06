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
</html>