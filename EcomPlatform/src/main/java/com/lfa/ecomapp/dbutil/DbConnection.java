/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.ecomapp.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author kamal
 */
public class DbConnection {

    private Connection conn = null;
    private PreparedStatement stmt = null;

    public void open() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/ajv_17_008_mult", "root", "");
    }

    public PreparedStatement initStatement(String sql) throws ClassNotFoundException, SQLException {
        stmt = conn.prepareStatement(sql);
        return stmt;
    }

    public ResultSet query() throws ClassNotFoundException, SQLException {
        return stmt.executeQuery();
    }

    public int update() throws ClassNotFoundException, SQLException {
        return stmt.executeUpdate();
    }

    public void close() throws SQLException {
        stmt.close();
    }

}
