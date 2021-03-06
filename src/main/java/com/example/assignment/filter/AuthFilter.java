package com.example.assignment.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "AuthFilter", urlPatterns = {"/*"})
public class AuthFilter implements Filter {

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        HttpSession session = request.getSession();
        String user = (String) session.getAttribute("user");
        String action = request.getServletPath();
        if (user == null && !action.contains("login"))  {
            response.sendRedirect("");
        }else {
            chain.doFilter(req, resp);
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
