package login;
/**
 * System:                 CleanBnB
 * Name:                   ${NAME}
 * Description:            Class that represents a ${NAME}'s Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/20/21
 */

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import login.bean.Login;

import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "login", value = "/login")
@WebServlet("/login")
public class LoginServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "Hello World!" + "</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        Login login = new Login();
        login.setName(name);
        login.setPassword(password);
        boolean autenticado = login.autenticacion();

        RequestDispatcher dispatcher = null;
        if(autenticado){
            dispatcher = request.getRequestDispatcher("welcome.jsp");
        }else{
            dispatcher = request.getRequestDispatcher("error.jsp");
        }

        dispatcher.forward(request,response);
    }
}
