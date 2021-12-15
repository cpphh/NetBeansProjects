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
public class Bai7 {

    int a;
    int b;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    void nhap() {
        boolean check = false;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("Nhap vao a:");
                a = Integer.parseInt(sc.nextLine());
                check = true;
            } catch (java.lang.NumberFormatException e) {
                System.out.println("hay nhap dung kieu du lieu" + e.toString());
                check = false;
            }
        } while (check == false);
        do {
            try {
                System.out.println("Nhap vao b:");
                b = Integer.parseInt(sc.nextLine());
                check = true;
            } catch (java.lang.NumberFormatException e) {
                System.out.println("hay nhap dung kieu du lieu" + e.toString());
                check = false;
            }
        } while (check == false);
    }

    int USCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    int BSCNN(int a, int b) {
        return a * b / USCLN(a, b);
    }

    public static void main(String[] args) {
        Bai7 bai7 = new Bai7();
        bai7.nhap();
        System.out.println("Uoc chung lon nhat :" + bai7.USCLN(bai7.getA(), bai7.getB()));
        System.out.println("Boi so chung nho nhat :" + bai7.BSCNN(bai7.getA(), bai7.getB()));
    }
    
}


