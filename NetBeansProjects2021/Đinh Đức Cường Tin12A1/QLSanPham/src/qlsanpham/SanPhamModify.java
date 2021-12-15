/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsanpham;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author cuong
 */
public class SanPhamModify {

    public static void Them(SanPham sp) {
        try {
            Connect a = new Connect();
            Connection conn = a.getConnection();
            PreparedStatement ps = conn.prepareStatement("insert into sanpham values(?,?,?,?)");
            ps.setString(1, sp.getMasp());
            ps.setString(2, sp.getTensp());
            ps.setString(3, sp.getHangsx());
            ps.setString(4, sp.getGia());
            int qr = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void Sua(SanPham sp) {
        try {
            Connect a = new Connect();
            Connection conn = a.getConnection();
            PreparedStatement ps = conn.prepareStatement("update sanpham set tensp=?, hangsx=?, gia=? where masp=?");

            ps.setString(1, sp.getTensp());
            ps.setString(2, sp.getHangsx());
            ps.setString(3, sp.getGia());
            ps.setString(4, sp.getMasp());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static int Xoa(String masp) throws SQLException {
        Connect a = new Connect();
        Connection conn = a.getConnection();
        PreparedStatement ps = conn.prepareStatement("delete sanpham where masp=?");
        ps.setString(1, masp);
        int qr = ps.executeUpdate();
        return qr;
    }
}
