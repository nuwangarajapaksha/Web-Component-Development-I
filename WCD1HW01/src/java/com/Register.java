/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author NUWAA
 */
public class Register extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("register.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String address = req.getParameter("address");
        String phone = req.getParameter("phone");

        ArrayList<User> users = new ArrayList();

        ServletContext sc = getServletContext();

        Object usersObject = sc.getAttribute("users");
        if (usersObject != null) {
            users = (ArrayList) usersObject;
        }

        boolean b = true;
        for (User u : users) {
            if (u.getEmail().equals(email)) {
                b = false;
                break;
            }
        }

        if (b) {
            User user = new User();
            user.setName(name);
            user.setEmail(email);
            user.setPassword(password);
            user.setAddress(address);
            user.setPhone(phone);

            users.add(user);

            sc.setAttribute("users", users);
            resp.sendRedirect("index.jsp");
        } else {
            resp.getWriter().write("User " + email + " Already exist");
        }

    }

}
