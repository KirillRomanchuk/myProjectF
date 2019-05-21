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
      <jsp:include page="WEB-INF/headerfooter/header.jsp"/>
    </jsp:attribute>
    <jsp:attribute name="footer">
      <p id="copyright">Copyright 2019, Bla-Bla-Bla Inc.</p>
    </jsp:attribute>

    <jsp:body>
        <div class="row">
            <div class="col-sm-4">
                <p>Hi I'm the body in bootstrap!</p>
            </div>
        </div>
    </jsp:body>
</t:genericpage>
</html>