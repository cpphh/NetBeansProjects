/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

import java.util.Scanner;

/**
 *
 * @author C
 */
public abstract class GiangVien {

    String ten;
    String email;
    String diaChi;
    long sdt;
    long gioGiangDay;

    public GiangVien() {
    }

    public GiangVien(String ten, String email, String diachi, long sdt, long gioGiangDay) {
        this.ten = ten;
        this.email = email;
        this.diaChi = diachi;
        this.sdt = sdt;
        this.gioGiangDay = gioGiangDay;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        ten = scanner.nextLine();
        System.out.print("Nhập email: ");
        email = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diaChi = scanner.nextLine();
        System.out.print("Nhập số điện thoại: ");
        sdt = scanner.nextLong();
        System.out.print("Nhập số giờ giảng dạy: ");
        gioGiangDay = scanner.nextLong();
    }

    public void xuat() {
        System.out.print("Họ tên: " + ten + ", Email: " + email + ", Địa chỉ: " + diaChi + ", Sđt: " + sdt + ", Giờ giảng dạy: " + gioGiangDay);
    }

    public abstract Long tinhLuong();

}
