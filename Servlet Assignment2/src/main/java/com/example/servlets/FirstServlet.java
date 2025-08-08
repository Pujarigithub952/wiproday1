package com.example.servlets;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String name = request.getParameter("name");
        String marksStr = request.getParameter("marks");

        request.setAttribute("studentName", name);
        request.setAttribute("marks", Integer.parseInt(marksStr));

        RequestDispatcher rd = request.getRequestDispatcher("SecondServlet");
        rd.forward(request, response);
    }
}