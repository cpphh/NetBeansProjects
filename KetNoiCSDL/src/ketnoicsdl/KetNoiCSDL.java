/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ketnoicsdl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author cuong
 */
public class KetNoiCSDL {

    Connection cn = null;

    public KetNoiCSDL() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/qlsv";
        this.cn = DriverManager.getConnection(url, "root", "");
    }

    public ResultSet LayDL(String tenbang) throws SQLException {
        ResultSet kq;
        Statement st = this.cn.createStatement();
        String sql = "select * from " + tenbang;
        kq = st.executeQuery(sql);
        return kq;
    }

    public void output() throws SQLException {
        KetNoiCSDL a = new KetNoiCSDL();
        ResultSet rs = a.LayDL("hocsinh");
        while (rs.next()) {
            System.out.println(rs.getString(1) + ' ' + rs.getString(2) + ' ' + rs.getString(3));
        }
    }

    public int insert(String ma, String ten, int tuoi) throws SQLException {
        int result;
        String sql = "insert into hocsinh values(?,?,?)";
        PreparedStatement pp = cn.prepareStatement(sql);
        pp.setString(1, ma);
        pp.setString(2, ten);
        pp.setInt(3, tuoi);
        result = pp.executeUpdate();

        return result;
    }

    public int update(String ma, String ten, int tuoi) throws SQLException {
        int result;
        String sql = "update hocsinh set ten = ?, tuoi = ? where ma = ?";
        PreparedStatement pp = cn.prepareStatement(sql);
        pp.setString(1, ten);
        pp.setInt(2, tuoi);
        pp.setString(3, ma);
        result = pp.executeUpdate();

        return result;
    }

    public int delete(String ma) throws SQLException {
        int result;
        String sql = "delete from hocsinh where ma = ?";
        PreparedStatement pp = cn.prepareStatement(sql);
        pp.setString(1, ma);
        result = pp.executeUpdate();

        return result;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

        KetNoiCSDL kn = new KetNoiCSDL();
        kn.output();
//        kn.insert("18", "dinh duy", 20);
//        System.out.println("Sau khi thêm DL: ");
//        kn.output();
        kn.delete("18");
        System.out.println("Sau khi xóa DL: ");
        kn.output();

    }

}
