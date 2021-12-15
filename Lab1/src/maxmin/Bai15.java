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
public class Bai15 {

    int[] selectionSort(int[] b) {
        for (int i = 0; i < b.length - 1; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (b[i] > b[j]) {
                    int tem = b[i];
                    b[i] = b[j];
                    b[j] = tem;
                }
            }
        }
        return b;
    }

    void printArr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    int[] chen(int[] a, int x) {
        int[] b = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
            if (a[i] >= x) {
                for (int j = a.length; j > i; j--) {
                    b[j] = a[j - 1]; //Dịch các phần tử sang phải 1 vị trí
                }
                b[i] = x; //Thêm x vào vị trí vt
                break;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao n:");
        n = Integer.parseInt(sc.nextLine());
        int[] a = new int[n];
        System.out.println("Nhap vao gia tri cua mang ");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + (i + 1) + "]");
            a[i] = Integer.parseInt(sc.nextLine());
        }
        int max1 = a[0];
        int max2 = Integer.MIN_VALUE;
        int vt1 = 0;
        int vt2 = 0;
        for (int i = 0; i < n; i++) {
            if (max1 < a[i]) {
                max2 = max1;
                max1 = a[i];
                vt2 = vt1;
                vt1 = i;
            } else if (a[i] > max2 && a[i] < max1) {
                max2 = a[i];
                vt2 = i;
            }
        }
        System.out.println("so lon thu 1 la :" + max1 + " vi tri :" + (vt1 + 1));
        System.out.println("so lon thu 2 la :" + max2 + " vi tri :" + (vt2 + 1));
        System.out.print("mang sau khi sap xep :");
        Bai15 bai15 = new Bai15();
        bai15.printArr(bai15.selectionSort(a));

        System.out.print("\nNhap so muon chen vao mang: ");
        int x = sc.nextInt();
        System.out.print("Mang sau khi chen la :");
        bai15.printArr(bai15.chen(a, x));
    }

}
