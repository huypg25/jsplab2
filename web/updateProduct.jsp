<%-- 
    Document   : addProduct
    Created on : Oct 25, 2017, 11:30:06 AM
    Author     : HAITHANH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
            <h1>UPDATE PRODUCT</h1>
            <h3 style="color: red">${status}</h3>
            <form action="UpdateProduct">
                <table border="1">
                    <tr>
                        <td>Product Id:</td>
                        <td>
                            <input type="text" name="proId" value="${pro.proId}" disabled="true"/>
                            <input type="hidden" name="proId" value="${pro.proId}"/>
                        </td>                        
                    </tr>
                    <tr>
                        <td>Product Name: </td>
                        <td>
                            <input type="text" name="proName" value="${pro.proName}" required/>
                        </td>
                    </tr>
                    <tr>
                        <td>Producer: </td>
                        <td>
                            <input type="text" name="producer" value="${pro.producer}" required/>
                        </td>
                    </tr>
                    <tr>
                        <td>Year Making: </td>
                        <td>
                            <input type="text" name="yearMaking" value="${pro.yearMaking}" required/>
                        </td>
                    </tr>
                    <tr>
                        <td>Price: </td>
                        <td>
                            <input type="text" name="price" value="${pro.price}" required/>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <input type="submit" value="Update"/>
                            <input type="reset" value="Clear"/>
                        </td>
                    </tr>
                </table>
            </form>
        </center>
    </body>
</html>
