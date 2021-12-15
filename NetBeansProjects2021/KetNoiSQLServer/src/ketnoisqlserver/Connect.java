/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ketnoisqlserver;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author C
 */
public class Connect {
    public Connection getConnection(){
        Connection conn = null;
        try {
            //Class.forName(com.microsoft.sqlserver.jdbc.SQLServerDriver);
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433", "sa", "0000");
            if(conn != null){
                System.out.println("Ket noi thanh cong");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return conn;
    }
    
}
