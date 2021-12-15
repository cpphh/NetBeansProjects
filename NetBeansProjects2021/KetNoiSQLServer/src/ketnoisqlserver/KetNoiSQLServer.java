/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ketnoisqlserver;
import java.sql.*;

/**
 *
 * @author C
 */
public class KetNoiSQLServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
       String dbURL = "jdbc:sqlserver://DESKTOP-9GSB6Q2\\CR;databaseName=dinhcuong;user=sa;password=0000";
        Connection conn = DriverManager.getConnection(dbURL);
        if (conn != null) {
            System.out.println("Connected");
        }
    }
    
}
