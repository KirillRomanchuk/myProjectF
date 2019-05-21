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
      Registration page
    </jsp:attribute>
    <jsp:attribute name="header">
      <jsp:include page="WEB-INF/headerfooter/header.jsp"/>
    </jsp:attribute>
    <jsp:attribute name="footer">
    </jsp:attribute>

    <jsp:body>
        <body class="text-center">

        <form class="form-signin" method="post" action="registrationService">
            <h1 class="h3 mb-3 font-weight-normal">Registration</h1>
            <label for="firstName" class="sr-only">First name</label>
            <input type="text" id="firstName" name="firstName" class="form-control" placeholder="Enter your first name" required="" autofocus="">
            <label for="lastName" class="sr-only">Last name</label>
            <input type="text" id="lastName" name="lastName" class="form-control" placeholder="Enter your last name" required="" autofocus="">
            <label for="login" class="sr-only">Nickname</label>
            <input type="text" id="login" name="login" class="form-control" placeholder="Enter your login" required="" autofocus="">
            <label for="phone" class="sr-only">Phone</label>
            <input type="text" id="phone" name="phone" class="form-control" placeholder="Enter your phone" required="" autofocus="">
            <label for="inputEmail" class="sr-only">Email address</label>
            <input type="email" id="inputEmail" name="email" class="form-control" placeholder="Email address" required="" autofocus="">
            <label for="inputPassword" class="sr-only">Password</label>
            <input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required="">
            <button class="btn btn-lg btn-primary btn-block" type="submit">Apply</button>
        </form>
        </body>
    </jsp:body>
</t:genericpage>
</html>

