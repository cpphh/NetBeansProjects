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
public class Bai11 {

    public static void main(String[] args) {
        int n, x, flag = 1, loc = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Nhap cac gia tri cho mang:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.print("Nhap so muon xoa:");
        x = s.nextInt();
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                flag = 1;
                loc = i;
                break;
            } else {
                flag = 0;
            }
        }
        if (flag == 1) {
            for (int i = loc + 1; i < n; i++) {
                a[i - 1] = a[i];
            }
            System.out.print("Mang sau khi xoa:");
            for (int i = 0; i < n - 2; i++) {
                System.out.print(a[i] + ",");
            }
            System.out.print(a[n - 2]);
        } else {
            System.out.println("Khong tim thay phan tu can xoa");
        }
    }

}
