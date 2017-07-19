package ro.teamnet.zth.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Alexandru.Negoita on 7/19/2017.
 */
public class HttpSessionLogin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = (String) request.getParameter("username");
        String password = (String) request.getParameter("password");
        response.setContentType("text/html");
//        String raspuns = "";
        Cookie[] c = request.getCookies();
        if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
//                response += request.getSession();
                PrintWriter pw = response.getWriter();
                pw.write( "bine ai revenit" + username);
            } else {
                request.getSession().setAttribute("user" , username);
                request.getSession().setAttribute("session" , request.getSession());
            RequestDispatcher requestDispatcher =
                    request.getRequestDispatcher("/views/loginFail.jsp");
            requestDispatcher.include(request,response);
            }

    }
}
