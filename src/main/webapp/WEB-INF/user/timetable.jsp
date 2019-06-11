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
        <table id = "timeList" class="table table-sm table-striped">
            <thead>
            <tr>
                <th>master</th>
                <th>date</th>
                <th>star time</th>
                <th>end time</th>
                <th>registration</th>
            </thead>

            <c:forEach var="timetable" items="${timetableList}">
                <tr>
                    <td>${timetable.getId()}</td>
                    <td>${timetable.getMaster()}</td>
                    <td>${timetable.getData()}</td>
                    <td>${timetable.getStartTime()}</td>
                    <td>${timetable.getUser()}</td>
                </tr>
            </c:forEach>
        </table>
    </jsp:body>
</t:genericpage>
</html>
