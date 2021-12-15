/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinhVien;

import java.util.Scanner;

/**
 *
 * @author C
 */
public abstract class SinhVienPoly{

    String ten;
    String nganh;

    public SinhVienPoly() {
    }

    public SinhVienPoly(String ten, String nganh) {
        this.ten = ten;
        this.nganh = nganh;
    }

    public abstract double getDiem();

    public String getHocLuc() {
        if (getDiem() > 0 && getDiem() < 5) {
            return "Yếu";
        } else if (getDiem() >= 5 && getDiem() <= 7) {
            return "Trung Bình";
        } else if (getDiem() > 7 && getDiem() < 8) {
            return "Khá";
        } else if (getDiem() <= 10) {
            return "Giỏi";
        }
        return "Điểm sai";
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời nhập họ tên sinh viên: ");
        ten = scanner.nextLine();
        System.out.print("Mời nhập chuyên ngành: ");
        nganh = scanner.nextLine();
    }

    public void xuat() {
        System.out.print("Họ tên: " + ten + ", Ngành: " + nganh);
    }

}
