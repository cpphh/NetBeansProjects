/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cuong
 */
public class DinhDucCuong_Connection {

    public Connection getConnection() {
        Connection cn = null;

        String url = "jdbc:mysql://localhost:3306/qlsanpham";
        try {
            cn = DriverManager.getConnection(url, "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(DinhDucCuong_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cn;
    }
}
