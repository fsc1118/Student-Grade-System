package Servlet;

import DesignedException.ID_NotFoundException;
import DesignedException.WrongPasswordException;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "LogInServlet.java", value = "/LogInServlet.java")
public class LogInServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ID = request.getParameter("ID");
        String password = request.getParameter("Password");
        try {
            Service.Search.search(ID,password);
            System.out.println("Correct");
            response.sendRedirect("index.jsp");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch(WrongPasswordException e){
            response.getWriter().println("Wrong Password");
            System.out.println("Wrong password");
            response.sendRedirect("Login_window.jsp");
        } catch(ID_NotFoundException e){
            response.getWriter().println("Wrong ID");
            response.sendRedirect("Login_window.jsp");
            System.out.println("Wrong");
            //e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
