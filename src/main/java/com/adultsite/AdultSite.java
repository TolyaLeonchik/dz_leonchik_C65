package com.adultsite;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/testing")
public class AdultSite extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<h1>Enter your age to continue</h1>");
        String ageStr = req.getParameter("age");
        int age = Integer.parseInt(ageStr);
        try {
            if (age >= 18) {
                printWriter.println("<h2>You're adult. Welcome!</h2>");
            }
            else if (age > 0 && age < 18) {
                printWriter.println("<h2>You do not have the right of access</h2>");
            }
            else printWriter.println("<h2>Invalid age</h2>");
        } finally {
            printWriter.close();
        }
    }
}
