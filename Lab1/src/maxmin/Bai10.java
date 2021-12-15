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
public class Bai10 {

    public static void main(String[] args) {

        int size = 0;
        Scanner inputData = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        size = inputData.nextInt();
        int[] a = new int[size];

        System.out.println("Enter value for array:");
        for (int i = 0; i < size; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = inputData.nextInt();
        }
        int temp;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Mang sau khi sap xep tang dan: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println("\nPhan tu nho nhat cua mang: " + a[0]);

        int tong = 0, dem = 0;

        for (int i = 0; i < size; i++) {
            if (a[i] % 3 == 0) {
                tong = tong + a[i];
                dem++;
            }
        }
        double tbc = tong / dem;
        System.out.println("Trung binh cac so chia het cho 3: " + tbc);
    }
}
