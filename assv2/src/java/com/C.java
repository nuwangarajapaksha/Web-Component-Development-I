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
public class C extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("C - Request = " + req);
        System.out.println("C - Response = " + resp);

        resp.getWriter().write(" C=>");

        RequestDispatcher rd = req.getRequestDispatcher("/d");
//        rd.forward(req, resp);
        rd.include(req, resp);

    }
}
