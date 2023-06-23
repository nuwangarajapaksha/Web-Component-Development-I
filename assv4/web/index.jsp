<%-- 
    Document   : index
    Created on : Apr 19, 2022, 12:52:41 PM
    Author     : NUWAA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
if(session.getAttribute("islogin") != null && session.getAttribute("islogin").equals(Boolean.TRUE)){
    response.sendRedirect(response.encodeRedirectURL("home.jsp"));
}
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
    </head>
    <body>
        <h1>Login</h1>
         <form action="<%= response.encodeURL("a")%>" method="POST">
            Username: <input type="text" name="username"/>
            Password: <input type="password" name="password"/>
            <input type="submit" value="Login"/>
        </form>
    </body>
</html>
