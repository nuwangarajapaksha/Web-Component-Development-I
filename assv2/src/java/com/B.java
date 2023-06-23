/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author NUWAA
 */
public class B extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("B - Request = " + req);
        System.out.println("B - Response = " + resp);

        resp.getWriter().write("B=>");

        RequestDispatcher rd = req.getRequestDispatcher("/c");
//        rd.forward(req, resp);
        rd.include(req, resp);

    }

}
