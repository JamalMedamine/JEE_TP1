package com.tp1.tp1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "infoServlet", value = "/info-servlet")
public class InfoServlet extends HttpServlet {
    private String message;

    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h3>" +"request URI :"+ request.getRequestURI()  + "</h3>");
        out.println("<h3>" +"request URL :"+ request.getRequestURL()  + "</h3>");
        out.println("<h3>" +"contextPath :"+ request.getContextPath()  + "</h3>");
        out.println("<h3>" +"query string :"+ request.getQueryString()  + "</h3>");
        out.println("<h3>" +"get parameter text1 :"+ request.getParameter("text1") + "</h3>");
        out.println("<h3>" +"get parameter text2 :"+ request.getParameter("text2")  + "</h3>");
        out.println("<h1>" + "Server infos : "+ "</h1>");
        out.println("<h3>" +"server name :"+ request.getServerName()  + "</h3>");
        out.println("<h3>" +"server port :"+ request.getServerPort()  + "</h3>");
        out.println("<h1>" + "client infos : "+ "</h1>");
        out.println("<h3>" +"remote addr :"+ request.getRemoteAddr()  + "</h3>");
        out.println("<h3>" +"remote host :"+ request.getRemoteHost()  + "</h3>");
        out.println("<h3>" +"remote port :"+ request.getRemotePort()  + "</h3>");
        out.println("<h3>" +"remote user :"+ request.getRemoteUser()  + "</h3>");
        out.println("<h1>" + "Headers : "+ "</h1>");
        out.println("<h3>" +"host :"+ request.getHeader("host")  + "</h3>");
        out.println("<h3>" +"connection :"+ request.getHeader("connection")  + "</h3>");
        out.println("<h3>" +"accept :"+ request.getHeader("accept")  + "</h3>");
        out.println("<h3>" +"user-agent :"+ request.getHeader("user-agent")  + "</h3>");
        out.println("<h3>" +"accept-encoding :"+ request.getHeader("accept-encoding")  + "</h3>");
        out.println("<h3>" +"accept-language :"+ request.getHeader("accept-language")  + "</h3>");
        out.println("<h3>" +"alexatoolbar-alx_ns_ph :"+ request.getHeader("alexatoolbar-alx_ns_ph ")  + "</h3>");
        out.println("<h1>" + "Servlet Context Info : "+ "</h1>");
        out.println("<h3>" +"realPath :"+ request.getServletContext()  + "</h3>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}