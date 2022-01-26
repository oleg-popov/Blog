<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Add Post</h1>
<form method="post">
    <h3>Укажите название нового поста</h3>
    <input type="text" name="namePost"><br>
    <h3>Введите текст</h3>
    <textarea name="textPost"></textarea><br>
    <br>
    <h3>Укажите дату создания</h3>
    <input type="date" name="datePost">
    <h3>Опубликовать</h3>
    <input type="submit">
</form>
</body>
</html>
