package com.example.assignment.servlet;

import com.example.assignment.dao.UserDAO;
import com.example.assignment.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    private UserDAO userDAO;


    public void init() {
        userDAO = new UserDAO();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = null;
        try {
            user = userDAO.getUserByUsername(username);
        } catch (Exception e){
            String message = "Invalid email/password";
            request.setAttribute("message", message);
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
        if (!user.getPassword().equals(password)) {
            String message = "Invalid email/password";
            request.setAttribute("message", message);
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }

        HttpSession session = request.getSession();
        session.setAttribute("user", user.getUsername());
        response.sendRedirect("products");

    }
}
