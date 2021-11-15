<%--
  Created by IntelliJ IDEA.
  User: manh
  Date: 12/11/2021
  Time: 09:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product Management Application</title>
</head>
<body>
<center>
    <h1>Product Management</h1>
</center>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Products</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Amount</th>
            <th>Price</th>
            <th>Details</th>
        </tr>
        <c:forEach var="product" items="${listProducts}">
            <tr>
                <td><c:out value="${product.id}" /></td>
                <td><c:out value="${product.name}" /></td>
                <td><c:out value="${product.amount}" /></td>
                <td><c:out value="${product.price}" /></td>
                <td><c:out value="${product.details}" /></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>