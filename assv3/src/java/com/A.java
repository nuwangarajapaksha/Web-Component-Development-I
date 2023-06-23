/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author NUWAA
 */
@WebServlet(name = "A", urlPatterns = {"/a"})
public class A extends HttpServlet {

   @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/HTML");
        ServletContext servletContext = getServletContext();
        PrintWriter out = resp.getWriter();
        String id = req.getParameter("id");

        servletContext.setAttribute("text", "Hello !");

        if (id.equals("10")) {
            String value = servletContext.getInitParameter("name");
            String serverInfo = servletContext.getServerInfo();
            out.print(value);
            out.print("<br>");
            out.print(serverInfo);
        } else {
            out.print("Invalid Id");
            out.print("<br>");
            out.print(servletContext.getAttribute("text"));
        }
    }

}
