/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author NUWAA
 */
@WebServlet(name = "A", urlPatterns = {"/a"})
public class A extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if (username.equals("admin") && password.equals("1234")) {
            HttpSession session = req.getSession();
            session.setAttribute("islogin", true);
            session.setAttribute("username", "admin");
            resp.sendRedirect(resp.encodeRedirectURL("home.jsp"));
        } else {
            resp.sendRedirect(resp.encodeRedirectURL("index.jsp"));
        }
    }

}
