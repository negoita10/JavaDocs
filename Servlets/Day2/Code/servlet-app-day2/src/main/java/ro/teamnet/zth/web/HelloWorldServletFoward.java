package ro.teamnet.zth.web;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import static javax.swing.text.Position.Bias.Forward;

/**
 * Created by Alexandru.Negoita on 7/19/2017.
 */
public class HelloWorldServletFoward extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String value = (String) request.getAttribute("some attribute");
        response.getWriter().write("Hello <b>" + request.getParameter("user") + "</b> from the Forward Servlet!" + value);
    }
}