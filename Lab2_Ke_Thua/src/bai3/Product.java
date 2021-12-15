/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author C
 */
public class Product {
    private String maHH;
    private String tenHH;
    private float soLuong;
    private float gia1Sp;

    public Product() {
    }

    public Product(String maHH, String tenHH, float soLuong, float gia1Sp) {
        this.maHH = maHH;
        this.tenHH = tenHH;
        this.soLuong = soLuong;
        this.gia1Sp = gia1Sp;
    }

    public String getMaHH() {
        return maHH;
    }

    public void setMaHH(String maHH) {
        this.maHH = maHH;
    }

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public float getGia1Sp() {
        return gia1Sp;
    }

    public void setGia1Sp(float gia1Sp) {
        this.gia1Sp = gia1Sp;
    }

    @Override
    public String toString() {
        return "Product{" + "maHH=" + maHH + ", tenHH=" + tenHH + ", soLuong=" + soLuong + ", gia1Sp=" + gia1Sp + '}';
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã hàng hóa: ");
        this.maHH = sc.nextLine();
        System.out.print("Nhập tên hàng: ");
        this.tenHH = sc.nextLine();
        System.out.print("Nhập số lượng: ");
        this.soLuong = sc.nextFloat();
        System.out.print("Nhập giá 1 SP: ");
        this.gia1Sp = sc.nextFloat();
        System.out.println("----------------------------------------------------");
    }
    
    public void hienthi(){
        System.out.println(toString());
    }
}
