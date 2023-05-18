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

@WebServlet("/beijing_annotation")
public class Beijing extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<h1>Time in Beijing</h1>");
        TimeZone timeZone = TimeZone.getTimeZone("China Standard Time");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss z");
        dateFormat.setTimeZone(timeZone);
        Date beijingDate = new Date();
        String formattedTime = dateFormat.format(beijingDate);
        printWriter.println(formattedTime);
        printWriter.close();
    }
}
