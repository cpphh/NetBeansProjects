/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsanpham;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connect {

    public Connection getConnection() {
        /*
        Connection conn = null;
        try {
            //Class.forName(com.microsoft.sqlserver.jdbc.SQLServerDriver);
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost; databaseName = qlsp;", "sa", "0000");
            if (conn == null) {
                System.out.println("Kết nối thất bại");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return conn;
*/
        Connection cn = null;

        String url = "jdbc:mysql://localhost:3306/qlsp";
        try {
            cn = DriverManager.getConnection(url, "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cn;
    }
}
