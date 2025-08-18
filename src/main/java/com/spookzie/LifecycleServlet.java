package com.spookzie;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import java.io.*;


public class LifecycleServlet extends HttpServlet
{
    public void init()
    {
        System.out.println("init() called -> Servlet initialized");
    }

    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<h2>hello from life cycle servlet</h2>");
        System.out.println("service() called -> Ready to handle requests");
    }

    public void destroy()
    {
        System.out.println("destroy() -> Ready for garbage collection");
    }

    public String getServletInfo()
    {
        return "LifeCycleServlet";
    }
}