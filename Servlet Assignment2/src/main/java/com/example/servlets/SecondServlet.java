package com.example.servlets;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class SecondServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        String name = (String) request.getAttribute("studentName");
        int marks = (int) request.getAttribute("marks");

        String grade;
        if (marks >= 90) grade = "A";
        else if (marks >= 75) grade = "B";
        else if (marks >= 50) grade = "C";
        else grade = "Fail";

        request.setAttribute("grade", grade);
        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);
    }
}