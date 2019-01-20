<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>Index Page Home Page</title>

    <style>
        .users {
            background-color: #c6cec5;
            width: 30%;
            height: 100%;
            float: left;
        }
        .productsOfUser {
            background-color: #cdccc9;
            width: 70%;
            height: 100%;
            float: left;
        }
    </style>
</head>
<body>
<div class = "users">
    <c:forEach var="user" items="${allUsers}">
        <a href="/users/${user.id}">${user.fullName}</a>
        <br/>
    </c:forEach>
</div>
</body>

</html>


