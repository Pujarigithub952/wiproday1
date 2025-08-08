package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Retrieve form data
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String course = request.getParameter("course");
        String age = request.getParameter("age");

        // Set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Display data
        out.println("<html><body>");
        out.println("<h2>Student Registration Details</h2>");
        out.println("<p><b>Name:</b> " + name + "</p>");
        out.println("<p><b>Email:</b> " + email + "</p>");
        out.println("<p><b>Course:</b> " + course + "</p>");
        out.println("<p><b>Age:</b> " + age + "</p>");
        out.println("</body></html>");
    }
}
