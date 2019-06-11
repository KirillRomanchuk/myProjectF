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
        <table id = "userList" class="table table-sm table-striped">
            <thead>
            <tr>
                <th>Id</th>
                <th>firstName</th>
                <th>lastName</th>
                <th>email</th>
                <th>phone</th>
                <th>role</th>
            </thead>

            <c:forEach var="user" items="${userList}">
                <tr>
                    <td>${user.getId()}</td>
                    <td>${user.getFirstName()}</td>
                    <td>${user.getLastName()}</td>
                    <td>${user.getEmail()}</td>
                    <td>${user.getPhoneNumber()}</td>
                    <td>${user.getRole()}</td>
                </tr>
            </c:forEach>
        </table>
<%--        <div class="row">--%>
<%--            <div class="col-sm-4">--%>

<%--            </div>--%>
<%--        </div>--%>
    </jsp:body>
</t:genericpage>
</html>
