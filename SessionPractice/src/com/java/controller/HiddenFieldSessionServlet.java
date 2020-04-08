package com.java.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/hidden-fields", name = "HiddenFieldSessionServlet")
public class HiddenFieldSessionServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        request.getSession(false);
        writer.write("<html><a href='hidden-fields/form'>Use Form</a></br>" +
                "<a href='hidden-fields/dispatcher'>Use Request Dispatcher</a></br>" +
                "<a href='hidden-fields/redirect'>Use Send Redirect</a></br></html");

    }
}
