<%-- 
    Document   : home
    Created on : Apr 19, 2022, 12:54:50 PM
    Author     : NUWAA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (session.getAttribute("islogin") == null || session.getAttribute("islogin").equals(Boolean.FALSE)) {
        response.sendRedirect(response.encodeRedirectURL("index.jsp"));
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Home</h1>
        <%
            if (session.getAttribute("islogin") != null) {
                String name = session.getAttribute("username").toString();
                out.write(name);
            }
        %>
    </body>
</html>
