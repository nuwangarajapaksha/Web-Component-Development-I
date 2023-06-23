<%-- 
    Document   : index
    Created on : Nov 1, 2021, 11:23:33 AM
    Author     : NUWAA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
if (session.getAttribute("login") != null && session.getAttribute("login").equals(Boolean.TRUE)) {
        response.sendRedirect("home.jsp");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="login" method="post">
        <table>
            <tr>
                <th>Email</th>
                <td><input type="text" name="email"></td>
            </tr>
            <tr>
                <th>Password</th>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <th><a href="register.jsp">Create New Account</a></th>
                <td><input type="submit" value="Login"></td>
            </tr>
        </table>
        </form>
    </body>
</html>
