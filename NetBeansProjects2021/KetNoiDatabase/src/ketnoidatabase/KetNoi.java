/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ketnoidatabase;

/**
 *
 * @author C
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KetNoi {

    Connection con = null;

    public KetNoi() {
        String url = "jdbc:mysql://localhost/csdl";
        try {
            con = DriverManager.getConnection(url, "root", "");
            System.out.println("Kết nối thành công");
        } catch (SQLException ex) {
            Logger.getLogger(KetNoi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet getData() {
        String sql = "select *from nhanvien";
        ResultSet kq = null;
        try {
            Statement st = con.createStatement();
            kq = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(KetNoi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }

    public void inDL() throws SQLException {
        KetNoi con = new KetNoi();
        ResultSet rs = con.getData();
        while (rs.next()) {
            System.out.println("Id: " + rs.getString(1) + "  Họ tên: " + rs.getString(2));
            System.out.println("------------------------------------------------");
        }
    }

    public static void main(String[] args) throws SQLException {
        KetNoi test = new KetNoi();
        test.inDL();
    }

}
