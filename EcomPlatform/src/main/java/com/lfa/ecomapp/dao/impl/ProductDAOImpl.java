/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.ecomapp.dao.impl;

import com.lfa.ecomapp.dao.ProductDAO;
import com.lfa.ecomapp.dbutil.DbConnection;
import com.lfa.ecomapp.entity.Product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kamal
 */
public class ProductDAOImpl implements ProductDAO {

    private DbConnection db = new DbConnection();
    List<Product> productList = new ArrayList<>();

    @Override
    public List<Product> getAll() throws ClassNotFoundException, SQLException {
        db.open();
                String sql = "SELECT * FROM tbl_product";

        PreparedStatement stmt = db.initStatement(sql);
        ResultSet rs = db.query();
        while (rs.next()) {
            Product product = new Product();
            product.setId(rs.getInt("product_id"));
            product.setName(rs.getString("product_name"));
            product.setDescription(rs.getString("description"));
            product.setPrice(rs.getInt("price"));
            product.setQuantity(rs.getInt("quantity"));
            product.setStatus(rs.getBoolean("status"));
            productList.add(product);
        }
        db.close();
        return productList;
    }

    @Override
    public Product getById(int id) throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM tbl_product WHERE id=?";
        Product product = null;
        db.open();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setInt(1, 3);
        ResultSet rs = db.query();
        if (rs.next()) {
            product = new Product();
            product.setId(rs.getInt("product_id"));
            product.setName(rs.getString("product_name"));
            product.setDescription(rs.getString("description"));
            product.setPrice(rs.getInt("price"));
            product.setQuantity(rs.getInt("quantity"));
            product.setStatus(rs.getBoolean("status"));
        }
        db.close();
        return product;
    }

    @Override
    public int insert(Product p) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO tbl_product(product_name,description,price,quantity,status) VALUES (?,?,?,?,?)";
        db.open();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setString(1, p.getName());
        stmt.setString(2, p.getDescription());
        stmt.setInt(3, p.getPrice());
        stmt.setInt(4, p.getQuantity());
        stmt.setBoolean(5, p.isStatus());

        int Result = stmt.executeUpdate();
        db.close();
        return Result;
    }
}
