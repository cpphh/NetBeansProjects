/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxmin;

import java.util.Scanner;

/**
 *
 * @author C
 */
public class Bai6 {

    boolean sohh(int a) {
        int tong = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                tong += i;
            }
        }
        if (tong == a) {
            return true;
        } else {
            return false;
        }
    }

    public void hienThiSHH(int a) {
        for (int i = 0; i < a; i++) {
            if (sohh(i) == true) {
                System.out.print(i + " ");
            }
        }
    }

    boolean songt(int a) {
        if (a < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void hienThiSNT(int a) {
        for (int i = 1; i < a; i++) {
            if (songt(i) == true) {
                System.out.print(i + " ");
            }
        }
    }

    int tong(int a) {
        int tong1 = 0;
        for (int i = 0; i < a; i++) {
            tong1 += i;
        }
        return tong1;
    }

    void tichthuaso(int a) {
        int i = 2;
        int dem = 0;
        System.out.println("Tich thua so");
        while (a != 1) {
            if (a % i == 0) {
                a /= i;
                dem++;
            } else {
                if (dem == 0 || dem == 1) {
                    System.out.print(i + "*");
                } else {
                    System.out.print(i + "*" + dem + "*");
                }
                i++;
                dem = 0;
            }
        }
        System.out.println("");
    }

    void menu() {
        System.out.println("1.Nhập vào một số nguyên dương n.");
        System.out.println("2.Tính tổng các số từ 1 đến n");
        System.out.println("3.Kiểm tra n có là số nguyên tố");
        System.out.println("4.Kiểm tra n có là số hoàn hảo");
        System.out.println("5.Hiển thị số n thành tích các thừa số nguyên tố");
        System.out.println("0.Thoat!");
    }

    public static void main(String[] args) {
        Bai6 bai6 = new Bai6();
        int a = 0;
        int n = 0;
        Scanner sc = new Scanner(System.in);
        do {
            boolean check = false;
            do {
                bai6.menu();
                try {
                    System.out.println("Nhap vao lua chon :");
                    a = Integer.parseInt(sc.nextLine());
                    check = true;
                } catch (java.lang.NumberFormatException e) {
                    System.out.println("hay nhap dung kieu du lieu" + e.toString());
                    check = false;
                }
            } while (check == false);
            switch (a) {
                case 1: {
                    System.out.println("Nhap so n: ");
                    n = Integer.parseInt(sc.nextLine());
                    break;
                }
                case 2: {
                    System.out.println("Tong cac so tu 1 den n = " + bai6.tong(n));
                    break;
                }
                case 3: {
                    if (bai6.songt(n)) {
                        System.out.println("n la So Nguyen To");
                    } else {
                        System.out.println("n khong la So Nguyen To");
                    }
                    break;
                }
                case 4: {
                    if (bai6.sohh(n)) {
                        System.out.println("n la So Hoan Hao");
                    } else {
                        System.out.println("n khong la So Hoan Hao");
                    }
                    break;
                }
                case 5: {
                    bai6.tichthuaso(n);
                    break;
                }
                case 0: {
                    break;
                }
                default: {
                    System.out.println("Khong co lua chon cua ban ");
                    break;
                }
            }
        } while (a != 0);
    }
}
