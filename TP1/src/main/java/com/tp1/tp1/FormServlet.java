package com.tp1.tp1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "formServlet", value = "/form-servlet")
public class FormServlet extends HttpServlet {
    private String message;

    public void init() {

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>"+"User Informations "+"</h1>");
        out.println("<h4>"+"First Name : "+ request.getParameter("firstname")+"</h4>");
        out.println("<h4>"+"Last Name  :"+ request.getParameter("lastname")+"</h4>");
        out.println("<h4>"+"UserName  :"+ request.getParameter("username")+"</h4>");
        out.println("<h4>"+"Gender  :"+ request.getParameter("gender")+"</h4>");
        out.println("<h4>"+"Address  :"+ request.getParameter("address")+"</h4>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
