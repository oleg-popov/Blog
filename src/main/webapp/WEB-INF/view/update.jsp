<%--
  Created by IntelliJ IDEA.
  User: dn030
  Date: 22.01.2022
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
<form method="post" name="id">
    <h3>Укажите новое названание поста</h3>
    <input type="text" name="namePost" value="${post.namePost}"><br>
    <h3>Введите новый текс поста</h3>
    <input type="text" name="textPost" value="${post.textPost}"><br>
    <h3>Укажите новую дату публикации</h3>
    <input type="date" name="datePost" value="${post.datePost}">
    <input type="hidden" value="${post.id}"><br>
    <input type="submit">
</form>

</body>
</html>
