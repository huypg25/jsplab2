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
        <h1>DETAIL PRODUCTS</h1>
        <table border="0" cellspacing="10px">
            <tr>
                <td><b>Product Id:</b></td>
                <td>${pro.proId}</td>
            </tr>
            <tr>
                <td><b>Product Name:</b></td>
                <td>${pro.proName}</td>
            </tr>
            <tr>
                <td><b>Producer:</b></td>
                <td>${pro.producer}</td>
            </tr>
            <tr>
                <td><b>Year Making:</b></td>
                <td>${pro.yearMaking}</td>
            </tr>
            <tr>
                <td><b>Price:</b></td>
                <td><fmt:formatNumber currencySymbol="" value="${pro.price}"></fmt:formatNumber> đ</td>
            </tr>
            <tr>
                <td>
                    <a href="PreUpdateProduct?proId=${pro.proId}">Update</a>
                </td>
                <td>
                    <a href="LoadAllProducts">Back</a>                    
                </td>
            </tr>
        </table>
    </center>
</body>
</html>
