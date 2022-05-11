<%-- 
    Document   : index
    Created on : Oct 24, 2017, 9:01:05 AM
    Author     : HAITHANH
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1>ALL PRODUCTS</h1>
        <h3 style="color: red">${status}</h3>
        <table border="1" cellspacing="10px">
            <tr>
                <th>Product Id</th>
                <th>Product Name</th>
                <th>Producer</th>
                <th>Year Making</th>
                <th>Price</th>
                <th>Details</th>
                <th>Deletes</th>
            </tr>
            <c:forEach items="${listP}" var="p">
                <tr>
                    <td>${p.proId}</td>
                    <td>${p.proName}</td>
                    <td>${p.producer}</td>
                    <td>${p.yearMaking}</td>
                    <td><fmt:formatNumber currencySymbol="" value="${p.price}"></fmt:formatNumber> đ</td>
                    <td><a href="DetailProduct?id=${p.proId}">detail</a></td>
                    <td><a href="DeleteProduct?id=${p.proId}">delete</a></td>
                </tr>
            </c:forEach>
        </table>
        <a href="addProduct.jsp">Add New Product</a>
    </center>
</body>
</html>
