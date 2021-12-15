/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ketnoidatabase;

import java.sql.*;
/**
 *
 * @author C
 */
public class KetNoiTrenMang {
    public static void main(String[] args) {
        try {
            // connnect to database 'testdb'
            String url = "jdbc:mysql://localhost/csdl";
            Connection conn = DriverManager.getConnection(url, "root", "");
            
            // crate statement
            Statement stmt = conn.createStatement();
            
            // insert 'student'
            /*
            stmt.executeUpdate("INSERT INTO student(id, name, address) "
                    + "VALUES (5, 'Vinh', 'Hanoi')");
            */
            
            // get data from table 'student'
            ResultSet rs = stmt.executeQuery("SELECT * FROM nhanvien");
            // show data
            while (rs.next()) {
                System.out.println(rs.getString(1) + "  " + rs.getString(2));
            }
            
            // close connection
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
