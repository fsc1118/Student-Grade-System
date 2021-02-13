package Servlet;

import DesignedException.Repeat_id_Exception;
import Service.AddUser;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "SignInServlet", value = "/SignInServlet")
public class SignInServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("ID");
        String password = request.getParameter("Password");
        try {
            AddUser.addUser(id, password);
            response.sendRedirect("index.jsp");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch(Repeat_id_Exception e){
            e.printStackTrace();
            response.sendRedirect("sign_in.jsp");
        }

    }
}
