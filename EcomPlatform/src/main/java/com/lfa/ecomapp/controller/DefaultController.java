/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.ecomapp.controller;

import com.lfa.ecomapp.dao.ProductDAO;
import com.lfa.ecomapp.dao.impl.ProductDAOImpl;
import com.lfa.ecomapp.entity.Product;
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
@WebServlet(name = "home", urlPatterns = {"/"})
public class DefaultController extends Controller {

    private ProductService pService = new ProductServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setAttribute("products", pService.getAll());
            
        } catch (ClassNotFoundException | SQLException se) {
            System.out.println(se.getMessage());
        }
        request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
    }

}
