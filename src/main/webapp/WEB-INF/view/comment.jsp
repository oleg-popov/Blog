<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<html>
<head>
    <title>Comment</title>
</head>
<body>
<h1>Add Comments</h1>
<form method="post">
    <h3>Добавить комментарий</h3>
    <textarea name="commentText"></textarea><br>
    <h3>Добавить</h3>
    <input type="submit">
</form>
<c:if test="${post!=null}">

    <c:forEach items="${post.commentList}" var="comment">
        <p>
            Comment : ${comment.commentText}<br>
            Date : ${comment.commentDate}<br>
        </p>
    </c:forEach>
</c:if>
<a href="/">return</a>
</body>
</html>
