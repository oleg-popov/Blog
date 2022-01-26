<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<html>
<head>
    <title>Title</title>
    <%--    <link rel="stylesheet" href="../style/index.css">--%>
    <style>
        body {
            background: burlywood;
        }

        th {
            border: 3px solid blue;
        }

        td {
            border: 2px solid maroon;
        }

        table {
            border: 3px solid darkgreen;
            text-align: center;
            /*display: flex;*/
            flex-wrap: initial;
        }

        .one {
            width: 400px;
            size: 100px;
        }
    </style>
</head>
<body>
<h1>Home</h1>
<nav>
    <menu>
        <li><a href="/add">New Post</a></li>
        <li><a href="/findById">Find By Id Post</a></li>
    </menu>
</nav>
<table>
    <caption>Post List</caption>
    <thead>
    <tr>
        <th>#</th>
        <th>Name</th>
        <th>Text</th>
        <th>Date</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${posts}" var="post">
    <tr>
        <td>${post.id}</td>
        <td>${post.namePost}</td>
        <td><p class="one">${post.textPost}</p></td>
        <td>${post.datePost}</td>
        <td><a href="<c:url value="/post/delete?id=${post.id}"/>">Delete</a></td>
        <td><a href="/update?id=${post.id}">Update</a></td>
        <td><a href="/comment/${post.id}">Comments</a></td>
    </tr>
    </c:forEach>
</table>

</body>
</html>
