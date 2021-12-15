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
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số lượng Giảng Viên: ");
        int n = scanner.nextInt();
        GiangVien[] gv = new GiangVien[100];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho Giảng Viên Cơ Hữu(1) / Giảng Viên Thỉnh Giảng(2)");
            int chon = scanner.nextInt();
            if (chon == 1) {
                gv[i] = new GiangVienCoHuu();
            } else if (chon == 2) {
                gv[i] = new GiangVienThinhGiang();
            }
            gv[i].nhap();
            gv[i].tinhLuong();
        }

        System.out.println("----------------------------------------------------");
        System.out.println("========== Xuất toàn bộ danh sách Giảng Viên ==========");
        for (int i = 0; i < n; i++) {
            gv[i].xuat();
        }

        System.out.println("----------------------------------------------------");
        System.out.println("========== Xuất các Giảng Viên Thỉnh Giảng ==========");
        for (int i = 0; i < n; i++) {
            if (gv[i] instanceof GiangVienThinhGiang) {
                gv[i].xuat();
            }
        }

        System.out.println("----------------------------------------------------");
        System.out.println("========== Xuất các Giảng Viên Cơ Hữu ==========");
        for (int i = 0; i < n; i++) {
            if (gv[i] instanceof GiangVienCoHuu) {
                gv[i].xuat();
            }
        }

        long tong = 0L;
        for (int i = 0; i < n; i++) {
            tong += gv[i].tinhLuong();
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Tổng tiền lương của các Giảng Viên là: " + tong);

        GiangVien max = gv[0];
        for (int i = 1; i < n; i++) {
            if (max.tinhLuong() < gv[i].tinhLuong()) {
                max = gv[i];
            }
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Giảng Viên có lương cao nhất: ");
        max.xuat();
    }
}
