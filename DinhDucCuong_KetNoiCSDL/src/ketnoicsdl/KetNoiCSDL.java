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
import java.util.Scanner;

/**
 *
 * @author cuong
 */
public class KetNoiCSDL {

    Connection cn = null;

    public KetNoiCSDL() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/qlhh";
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
        ResultSet rs = a.LayDL("sanpham");
        while (rs.next()) {
            System.out.println(rs.getString(1) + ' ' + rs.getString(2) + ' ' + rs.getInt(3) + ' ' + rs.getInt(4));
        }
    }

    public int insert() throws SQLException {
        int result;
        int id; String tensp; int sluong; int dongia;
        System.out.print("Nhập id: "); id = sc.nextInt(); sc.nextLine();
        System.out.print("Nhập tên sản phẩm: "); tensp = sc.nextLine();
        System.out.print("Nhập số lượng: "); sluong = sc.nextInt();
        System.out.print("Nhập đơn giá: "); dongia = sc.nextInt();
        String sql = "insert into sanpham values(?,?,?,?)";
        PreparedStatement pp = cn.prepareStatement(sql);
        pp.setInt(1, id);
        pp.setString(2, tensp);
        pp.setInt(3, sluong);
        pp.setInt(4, dongia);
        result = pp.executeUpdate();

        return result;
    }

    public int update() throws SQLException {
        int result;
        int id; String tensp; int sluong; int dongia;
        System.out.print("Nhập id sp cần sửa: "); id = sc.nextInt(); sc.nextLine();
        System.out.print("Nhập tên sản phẩm: "); tensp = sc.nextLine();
        System.out.print("Nhập số lượng: "); sluong = sc.nextInt();
        System.out.print("Nhập đơn giá: "); dongia = sc.nextInt();
        String sql = "update sanpham set tensp = ?, sluong = ?, dongia = ? where id = ?";
        PreparedStatement pp = cn.prepareStatement(sql);
        pp.setString(1, tensp);
        pp.setInt(2, sluong);
        pp.setInt(3, dongia);
        pp.setInt(4, id);
        result = pp.executeUpdate();

        return result;
    }

    public int delete() throws SQLException {
        int result;
        System.out.print("Nhập id của sản phẩm cần xóa: ");
        int id = sc.nextInt();
        String sql = "delete from sanpham where id = ?";
        PreparedStatement pp = cn.prepareStatement(sql);
        pp.setInt(1, id);
        result = pp.executeUpdate();

        return result;
    }
    
    public void timkiem() throws SQLException{
        
        System.out.print("Nhập tên sản phẩm cần tìm kiếm: ");
        sc.nextLine();
        String tensp = sc.nextLine();
        ResultSet kq;
        Statement st = this.cn.createStatement();
        String sql = "select * from sanpham where id = 14";
        kq = st.executeQuery(sql);
        while (kq.next()) {
            System.out.println(kq.getString(1) + ' ' + kq.getString(2) + ' ' + kq.getInt(3) + ' ' + kq.getInt(4));
        }
    }
   
    public int tinhTien(){
        int tongTien = 0;
        return tongTien;
    }
    
    public static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

        KetNoiCSDL kn = new KetNoiCSDL();
        int chon;
        do {
            System.out.println("==========Menu==========");
            System.out.println("1. Hiển thị sản phẩm");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Sửa sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Tìm kiếm theo tên sản phẩm");
            System.out.println("6. Tìm kiếm sản phẩm Tiền cao nhất");
            System.out.println("0. Thoát!");
            System.out.print("Hãy nhập lựa chọn: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1: {
                    kn.output();
                    break;
                }
                case 2: {
                    kn.insert();
                    break;
                }
                case 3: {
                    kn.update();
                    break;
                }
                case 4: {
                    kn.delete();
                    break;
                }
                case 5: {
                    kn.timkiem();
                    break;
                }
                case 6: {
                    System.out.println("12 mu len 15 30000");
                    break;
                }
                default:
                    System.out.println("Hãy nhập đúng lựa chọn!");

            }
        } while (chon != 0);
    }
}
