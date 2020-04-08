package com.java.controller;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/url-rewrite/dispatcher")
public class URLRSDispatcherServlet extends javax.servlet.http.HttpServlet {

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {


        request.getRequestDispatcher("print?session=" + request.getSession().getId()).forward(request,response);
    }
}

