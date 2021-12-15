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
public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời nhập vào số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        SinhVienPoly[] sv = new SinhVienPoly[n];
        for (int i = 0; i < n; i++) {
            sv[i] = new SinhVienKT();
            sv[i].nhap();
        }

        SinhVienPoly max = sv[0];
        for (int i = 0; i < n; i++) {
            if (max.getDiem() < sv[i].getDiem()) {
                max = sv[i];
            }
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Sinh viên có điểm TB cao nhất: ");
        max.xuat();

        System.out.println("----------------------------------------------------");
        System.out.println("Danh sách sinh viên sau khi sắp xếp giảm dần theo điểm TB: ");
        SinhVienPoly temp = null;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (sv[i].getDiem() < sv[j].getDiem()) {
                    temp = sv[i];
                    sv[i] = sv[j];
                    sv[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            sv[i].xuat();
        }

    }

}
