/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author cuong
 */

public class Sinhvien implements Comparable<Sinhvien> {
    public static Scanner sc = new Scanner(System.in);

    private String Masv;
    private String Tensv;
    private Date Namsinh;
    private String Diachi;
    private String Lop;

    public Sinhvien() {
    }

    public Sinhvien(String Masv, String Tensv, Date Namsinh, String Diachi, String Lop) {
        this.Masv = Masv;
        this.Tensv = Tensv;
        this.Namsinh = Namsinh;
        this.Diachi = Diachi;
        this.Lop = Lop;
    }

    public String getMasv() {
        return Masv;
    }

    public void setMasv(String Masv) {
        this.Masv = Masv;
    }

    public String getTensv() {
        return Tensv;
    }

    public void setTensv(String Tensv) {
        this.Tensv = Tensv;
    }

    public Date getNamsinh() {
        return Namsinh;
    }

    public void setNamsinh(Date Namsinh) {
        this.Namsinh = Namsinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    @Override
    public String toString() {
        return "Sinhvien{" + "Masv=" + Masv + ", Tensv=" + Tensv + ", Namsinh=" + Namsinh + ", Diachi=" + Diachi + ", Lop=" + Lop + '}';
    }

    @Override
    public int compareTo(Sinhvien o) {
        return this.getMasv().compareTo(o.getMasv());
    }

    public void nhap(){
        System.out.print("Nhap ho ten:");
        this.Tensv=sc.nextLine();
        System.out.print("Nhap ma sv: ");
        this.Masv = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        this.Diachi = sc.nextLine();
        System.out.print("Nhap lop: ");
        this.Lop = sc.nextLine();
    }
}
