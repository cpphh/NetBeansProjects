/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kt_genneric;

import java.util.Scanner;

/**
 *
 * @author cuong
 */
public class CarDetail {

    private String ten;
    private String ma;
    private String moTa;
    private String nhaSanXuat;
    private double gia;

    public CarDetail() {
    }

    public CarDetail(String ten, String ma, String moTa, String nhaSanXuat, double gia) {
        this.ten = ten;
        this.ma = ma;
        this.moTa = moTa;
        this.nhaSanXuat = nhaSanXuat;
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "CarDetail{"
                + "Tên='" + ten + '\''
                + ", Mã='" + ma + '\''
                + ", Mô tả sản phẩm='" + moTa + '\''
                + ", Nhà sản xuất='" + nhaSanXuat + '\''
                + ", Giá='" + gia + '\''
                + '}';
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên xe: ");
        this.ten = sc.nextLine();
        System.out.print("Nhập mã xe: ");
        this.ma = sc.nextLine();
        System.out.print("Nhập mô tả xe: ");
        this.moTa = sc.nextLine();
        System.out.print("Nhập nhà sản xuất: ");
        this.nhaSanXuat = sc.nextLine();
        System.out.print("Nhập giá xe: ");
        this.gia = sc.nextDouble();
    }

}
