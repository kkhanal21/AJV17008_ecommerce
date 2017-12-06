/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.ecomapp.controller;
import com.lfa.ecomapp.service.ProductService;
import com.lfa.ecomapp.service.impl.ProductServiceImpl;
import com.lfa.ecomapp.system.Controller;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kamal
 */
@WebServlet(name = "product", urlPatterns = {"/product/*"})
public class ProductController extends Controller {

    private ProductService pService = new ProductServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("id") != null && request.getParameter("id").isEmpty()) {

            try {
                int id = Integer.parseInt(request.getParameter("id"));
                request.setAttribute("product", pService.getById(id));
                request.getRequestDispatcher("/WEB-INF/views/product/detail.jsp").forward(request, response);
            } catch (ClassNotFoundException | SQLException se) {
                System.out.println(se.getMessage());
            }
        } else {
            response.sendRedirect(request.getContextPath());
        }

    }

}
