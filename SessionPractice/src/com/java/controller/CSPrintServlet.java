package com.java.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/cookie/print")
public class CSPrintServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.write("SessionID ");


        // Cookie
        for(Cookie c : request.getCookies()){
            if(c.getName().equalsIgnoreCase("session")){
                writer.append("from cookie: " + c.getValue());
                return;
            }
        }

        // Session object
        writer.write("Not found from cookie");
    }
}
