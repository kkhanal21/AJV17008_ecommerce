/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.ecomapp.service.impl;

import com.lfa.ecomapp.dao.ProductDAO;
import com.lfa.ecomapp.dao.impl.ProductDAOImpl;
import com.lfa.ecomapp.entity.Product;
import com.lfa.ecomapp.service.ProductService;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author kamal
 */
public class ProductServiceImpl implements ProductService {

    private ProductDAO productDAO = new ProductDAOImpl();

    @Override
    public List<Product> getAll() throws ClassNotFoundException, SQLException {
        return productDAO.getAll();
    }

    @Override
    public Product getById(int id) throws ClassNotFoundException, SQLException {
        return productDAO.getById(id);
    }

    @Override
    public int insert(Product p) throws ClassNotFoundException, SQLException {
        return productDAO.insert(p);
    }

}
