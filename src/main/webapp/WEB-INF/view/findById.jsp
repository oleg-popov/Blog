<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<html>
<head>
    <title>Find</title>
</head>
<body>
<h1>Find By Id Post</h1>
<form method="post">
    <h3>Введи № Id поста</h3>
    <br>
    <input type="number" name="id">
    <input type="submit">
</form>
<c:if test="${post!=null}">
    <p>
        Name : ${post.namePost}<br>
        TextPost : ${post.textPost}<br>
        DatePost : ${post.datePost}<br>
    </p>
</c:if>

<%--    <c:if test="${post.id == id}">--%>
<%--        <tr>--%>
<%--        <td>${post.id}</td>--%>
<%--        <td>${post.name}</td>--%>
<%--        <td>${post.textPost}</td>--%>
<%--        <td>${post.datePost}</td>--%>

<%--        </tr>--%>
<%--    </c:if>--%>
<li><a href="/">Return</a></li>
</body>
</html>
