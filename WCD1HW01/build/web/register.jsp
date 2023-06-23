<%-- 
    Document   : register
    Created on : Nov 1, 2021, 11:29:11 AM
    Author     : NUWAA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Create New Account</h1>
        <form action="register" method="post">
            <table>
                <tr>
                    <th>Name</th>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <th>Email</th>
                    <td><input type="text" name="email"></td>
                </tr>
                 <tr>
                    <th>Password</th>
                    <td><input type="password" name="password"></td>
                </tr>
                <tr>
                    <th>Address</th>
                    <td><input type="text" name="address"></td>
                </tr>
                <tr>
                    <th>Phone</th>
                    <td><input type="text" name="phone"></td>
                </tr>
                <tr>
                    <th><a href="index.jsp">Login</a></th>
                    <td><input type="submit" value="Register"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
