/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.ecomapp.dao;

import com.lfa.ecomapp.entity.Product;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author kamal
 */
public interface ProductDAO {

    List<Product> getAll() throws ClassNotFoundException, SQLException;

    Product getById(int id) throws ClassNotFoundException, SQLException;

    int insert(Product p) throws ClassNotFoundException, SQLException;
}
