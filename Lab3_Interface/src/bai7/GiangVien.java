/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import java.util.Scanner;

/**
 *
 * @author cuong
 */
public abstract class GiangVien {
    private String tenGiangVien;
    private String email;
    private String diachi;
    private String dienThoai;
    private float tongLuong;
    private int soGioGiang;

    public GiangVien() {
    }

    public GiangVien(String tenGiangVien, String email, String diachi, String dienThoai, float tongLuong, int soGioGiang) {
        this.tenGiangVien = tenGiangVien;
        this.email = email;
        this.diachi = diachi;
        this.dienThoai = dienThoai;
        this.tongLuong = tongLuong;
        this.soGioGiang = soGioGiang;
    }

    public String getTenGiangVien() {
        return tenGiangVien;
    }

    public void setTenGiangVien(String tenGiangVien) {
        this.tenGiangVien = tenGiangVien;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public float getTongLuong() {
        return tongLuong;
    }

    public void setTongLuong(float tongLuong) {
        this.tongLuong = tongLuong;
    }

    public int getSoGioGiang() {
        return soGioGiang;
    }

    public void setSoGioGiang(int soGioGiang) {
        this.soGioGiang = soGioGiang;
    }

    @Override
    public String toString() {
        return "GiangVien{" + "tenGiangVien=" + tenGiangVien + ", email=" + email + ", diachi=" + diachi + ", dienThoai=" + dienThoai + ", tongLuong=" + tongLuong + ", soGioGiang=" + soGioGiang + '}';
    }

    
    public abstract GiangVien inputq();
    	public abstract void displayq();
    	public abstract void tinhluong();
      public void  input(){
          Scanner sc = new Scanner(System.in);
          System.out.println("");
    }
    public void display(){
        System.out.println(toString());
    }

    
}
