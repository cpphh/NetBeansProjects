/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ketnoidatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author C
 */
public class KetNoiDatabase {

    /**
     * @param args the command line arguments
     */
    Connection cn = null;

    public KetNoiDatabase() {
        String url = "jdbc:mysql://localhost/csdl";
        try {
            this.cn = DriverManager.getConnection(url, "root", "");
        } catch (SQLException ex) {
            System.out.println("Lỗi" + ex);
        }
    }

    public ResultSet getData(String tbname) {
        Statement st = null;
        ResultSet kq = null;
        String sql = "select * from nhanvien";
        try {
            st = cn.createStatement();
            kq = st.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println("Lỗi" + ex);
        }
        return kq;
    }

    public void inDL(String tablename) throws SQLException {
        KetNoiDatabase con = new KetNoiDatabase();
        ResultSet rs = null;
        rs = con.getData(tablename);
        while (rs.next()) {
            System.out.println("Id: " + rs.getString(1) + "  Họ tên: " + rs.getString(2));
            System.out.println("-------------------------------------------------");
        }
    }

    public void Insert(int id, String ten) {
        String sql = "insert into nhanvien values(" + id + ",'" + ten + "')";
        try {
            Statement st = this.cn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("Lỗi" + ex);
        }
    }

    public void DongDL(String csdl) throws SQLException {
        Statement st = this.cn.createStatement();
        st.close();
    }

    public void delete(int id) throws SQLException {
        KetNoiDatabase cn = new KetNoiDatabase();
        Statement st = this.cn.createStatement();
        String sql = "delete from nhanvien where id='" + id + "'";
        st.executeUpdate(sql);
    }

    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        KetNoiDatabase test = new KetNoiDatabase();
        test.inDL("nhanvien");

        test.Insert(6, "Trần Thị Nhung");
        System.out.println("Danh sách sau khi chèn thêm nhân viên:");
        test.inDL("nhanvien");

        test.delete(6);//xóa nhân viên theo ID
        System.out.println("Danh sách sau khi xóa nhân viên có Id = 6");
        test.inDL("nhanvien");

    }
}
