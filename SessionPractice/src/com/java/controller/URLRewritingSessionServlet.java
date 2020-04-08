package com.java.controller;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/url-rewrite", name = "URLRewritingSessionServlet")
public class URLRewritingSessionServlet extends javax.servlet.http.HttpServlet {

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter writer = response.getWriter();
        request.getSession(false);
        writer.write("<html><a href='url-rewrite/form'>Use Form</a></br>" +
                "<a href='url-rewrite/dispatcher'>Use Request Dispatcher</a></br>" +
                "<a href='url-rewrite/redirect'>Use Send Redirect</a></br></html");


    }
}

