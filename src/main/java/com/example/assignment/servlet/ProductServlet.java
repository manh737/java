package com.example.assignment.servlet;


import com.example.assignment.dao.ProductDAO;
import com.example.assignment.model.Product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "BookServlet", urlPatterns = {"/products"})
public class ProductServlet extends HttpServlet {
    private ProductDAO productDAO;


    public void init() {
        productDAO = new ProductDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Product> listProducts = productDAO.getAllProducts();
        request.setAttribute("listProducts", listProducts);
        request.getRequestDispatcher("/product-list.jsp").forward(request, response);
    }
}
