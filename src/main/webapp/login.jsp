<%@ page language="java" isErrorPage="true" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*, java.text.*" %>

<html>
<head>
    <title>Login Page</title>
</head>
<body>

<h1>Вход в систему</h1><br/>
<form method="get" action="${pageContext.request.contextPath}/app/login">

    <input type="text" name="name"><br/>
    <input type="password" name="pass"><br/><br/>
    <input class="button" type="submit" value="Войти">

</form>
<br/>
<a href="${pageContext.request.contextPath}/index.jsp">На головну</a>
</body>
</html>