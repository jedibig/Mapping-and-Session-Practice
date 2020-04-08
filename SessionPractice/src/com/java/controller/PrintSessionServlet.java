package com.java.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/print",name = "PrintSessionServlet")
public class PrintSessionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();

        HttpSession session = (HttpSession) request.getAttribute("session");

        // Session object
        writer.write("SessionID from HttpSession object: " + session.getId());
    }
}
