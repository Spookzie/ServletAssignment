package com.spookzie;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class ConfigTestServlet extends HttpServlet
{
    private ServletConfig config;

    public void init(ServletConfig config) throws ServletException
    {
        super.init(config);
        System.out.println(config);
        this.config = config;
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        String username = this.config.getInitParameter("username");
        String password = this.config.getInitParameter("password");

        PrintWriter out = response.getWriter();
        out.println("Logged in using username: " + username + " and password: " + password);
    }
}