<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>User's Products Page</title>

    <style>
        .users {
            background-color: #c6cec5;
            width: 20%;
            height: 100%;
            float: left;
        }
        .productsOfUser {
            background-color: #cdccc9;
            width: 80%;
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

<div class = "productOfUser">
    <h1>${userName.firstName} ${userName.lastName}</h1>
    <c:forEach var="product" items = "${products}">
        ${product.id}  ${product.title}
        <br/>
        ${product.description}
    </c:forEach>
</div>
</body>

</html>


