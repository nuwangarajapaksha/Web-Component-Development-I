/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import java.io.PrintWriter;
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
public class LoadUsers extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        ServletContext sc = getServletContext();
        if(sc.getAttribute("users") != null){
            ArrayList<User> users = (ArrayList<User>) sc.getAttribute("users");
            
            for(User u : users){
                out.write("Name "+u.getName()+"<br>");
                out.write("Email "+u.getEmail()+"<br>");
                out.write("Password "+u.getPassword()+"<br>");
                out.write("Address "+u.getAddress()+"<br>");
                out.write("Phone "+u.getPhone()+"<br>");
                out.write("<br><br>");
            }
        }
    }
    
}
