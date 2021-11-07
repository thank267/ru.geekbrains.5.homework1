<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Product List</title>
</head>
<body>
<h1>JSP - Product List</h1>
<table border="1">
    <tr>
        <td>id</td>
        <td>title</td>
        <td>cost</td>
    </tr>
    <c:forEach items="${products}" var="product">
        <tr>
            <td>${product.id}</td>
            <td>${product.title}</td>
            <td>${product.cost}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
