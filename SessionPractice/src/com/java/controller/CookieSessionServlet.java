package com.java.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/cookie", name = "CookieSessionServlet")
public class CookieSessionServlet extends javax.servlet.http.HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter writer = response.getWriter();


        Cookie c = new Cookie("session", request.getSession(false).getId());

        c.setMaxAge(100);
        response.addCookie(c);

        writer.write("<html><a href='cookie/form'>Use Form</a></br>" +
                "<a href='cookie/dispatcher'>Use Request Dispatcher</a></br>" +
                "<a href='cookie/redirect'>Use Send Redirect</a></br></html");

    }
}
