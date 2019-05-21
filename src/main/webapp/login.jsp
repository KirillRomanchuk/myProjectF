<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setLocale value="${sessionScope.lang}"/>
<fmt:setBundle basename="messages"/>

<html lang="${sessionScope.lang}">

<t:genericpage>
    <jsp:attribute name="style">
      <%@include file='css/signin.css' %>
    </jsp:attribute>
    <jsp:attribute name="title">
      Template Page
    </jsp:attribute>
    <jsp:attribute name="header">
      <jsp:include page="WEB-INF/headerfooter/header.jsp"/>
    </jsp:attribute>
    <jsp:attribute name="footer">
<%--      <p id="copyright">Copyright 2019, Bla-Bla-Bla Inc.</p>--%>
    </jsp:attribute>

    <jsp:body>
        <body class="text-center">

        <form class="form-signin" method="post" action="${pageContext.request.contextPath}/beautyhole/login">
            <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
            <label for="inputEmail" class="sr-only">Email address</label>
            <input type="email" id="inputEmail" name="email" class="form-control" placeholder="Email address" required="" autofocus="">
            <label for="inputPassword" class="sr-only">Password</label>
            <input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required="">
            <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
        </form>
        </body>
    </jsp:body>
</t:genericpage>
</html>