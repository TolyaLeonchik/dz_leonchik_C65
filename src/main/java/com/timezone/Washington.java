package com.timezone;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@WebServlet("/washington_annotation")
public class Washington extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<h1>Time in Washington</h1>");
        TimeZone timeZone = TimeZone.getTimeZone("Eastern Standard Time");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss z");
        dateFormat.setTimeZone(timeZone);
        Date washDate = new Date();
        String formattedTime = dateFormat.format(washDate);
        printWriter.println(formattedTime);
        printWriter.close();
    }
}
