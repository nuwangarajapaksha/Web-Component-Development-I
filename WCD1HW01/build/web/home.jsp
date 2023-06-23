<%-- 
    Document   : home
    Created on : Nov 1, 2021, 1:00:06 PM
    Author     : NUWAA
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (session.getAttribute("login") == null || session.getAttribute("login").equals( Boolean.FALSE)) {
        response.sendRedirect("index.jsp");
    }
    String email = "";
    if (session.getAttribute("email") != null) {
        email = session.getAttribute("email").toString();
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
            ServletContext sc = getServletContext();
            if (sc.getAttribute("users") != null) {
                ArrayList<User> users = (ArrayList<User>) sc.getAttribute("users");
                for (User u : users) {
                    if (u.getEmail().equals(email)) {
                        out.write("Name: " + u.getName()+"<br>");
                        out.write("Email: " + u.getEmail()+"<br>");
                        out.write("Address: " + u.getAddress()+"<br>");
                        out.write("Phone: " + u.getPhone()+"<br>");
                        break;
                    }
                }
            }
        %>
    </body>
</html>
