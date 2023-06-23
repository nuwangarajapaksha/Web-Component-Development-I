/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 *
 * @author NUWAA
 */
@WebListener
public class MyServletRequestListener implements ServletRequestListener{

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("Requet Initialized");
    }
    
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("Requet Destroyed");
    }
    
}
