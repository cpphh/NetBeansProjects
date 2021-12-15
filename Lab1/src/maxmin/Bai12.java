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
public class Bai12 {
    
    boolean songt(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
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
    
    public static boolean kiemTraChan(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Bai12 bai12 = new Bai12();
        int size = 0;
        Scanner inputData = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang:");
        size = inputData.nextInt();
        int[] intArr = new int[size];
        
        System.out.println("Nhap cac phan tu cho mang:");
        for (int i = 0; i < size; i++) {
            System.out.print("intArr[" + i + "] = ");
            intArr[i] = inputData.nextInt();
        }
        
        System.out.print("Cac so Nguyen To cua mang: ");
        for (int i = 0; i < size; i++) {
            if (bai12.songt(intArr[i])) {
                System.out.print(" " + intArr[i]);
            }
        }
        System.out.print("\nCac so Hoan Hao cua mang: ");
        for (int i = 0; i < size; i++) {
            if (bai12.sohh(intArr[i])) {
                System.out.print(" " + intArr[i]);
            }
        }
        System.out.print("\nCac so Chan cua mang: ");
        for (int i = 0; i < size; i++) {
            if (bai12.kiemTraChan(intArr[i])) {
                System.out.print(" " + intArr[i]);
            }
        }
    }
    
}
