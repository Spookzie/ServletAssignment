package com.spookzie;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));

        int result = num1+num2;
        PrintWriter out = response.getWriter();
        out.println("GET");
        out.println("The result is = " + result);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));

        int result = num1+num2;
        PrintWriter out = response.getWriter();
        out.println("POST");
        out.println("The result is = " + result);
    }
}