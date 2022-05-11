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
            <h1>ADD NEW PRODUCT</h1>
            <h3 style="color: red">${status}</h3>
            <form action="AddProduct">
                <table border="1">
                    <tr>
                        <td>Product Name: </td>
                        <td>
                            <input type="text" name="proName" required/>
                        </td>
                    </tr>
                    <tr>
                        <td>Producer: </td>
                        <td>
                            <input type="text" name="producer" required/>
                        </td>
                    </tr>
                    <tr>
                        <td>Year Making: </td>
                        <td>
                            <input type="text" name="yearMaking" required/>
                        </td>
                    </tr>
                    <tr>
                        <td>Price: </td>
                        <td>
                            <input type="text" name="price" required/>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <input type="submit" value="AddNew"/>
                            <input type="reset" value="Clear"/>
                        </td>
                    </tr>
                </table>
            </form>
        </center>
    </body>
</html>
