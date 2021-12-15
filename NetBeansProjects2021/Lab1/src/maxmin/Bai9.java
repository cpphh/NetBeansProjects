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
public class Bai9 {

    public static void main(String[] args) {
        int size = 0;
        Scanner inputData = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang:");
        size = inputData.nextInt();
        int[] intArr = new int[size];

        System.out.println("Nhap cac gia tri cua mang:");
        for (int i = 0; i < size; i++) {
            System.out.print("intArr[" + i + "] = ");
            intArr[i] = inputData.nextInt();
        }
        int key = 0;
        System.out.println("Nhap so can tim kiem:");
        key = inputData.nextInt();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (intArr[i] == key) {
                System.out.println("Tim thay " + key + " o vi tri " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay " + key);
        }
    }

}
