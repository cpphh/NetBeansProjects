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
public class Bai14 {

    int fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

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

    public static void main(String[] args) {
        Bai14 bai14 = new Bai14();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        System.out.println("So Fibonaci thu " + n + " la: " + bai14.fibonacci(n));

        System.out.print("Cac so Nguyen To nho hon n: ");
        for (int i = 0; i < n; i++) {
            if (bai14.songt(i) == true) {
                for (int j = 0; j < n; j++) {
                    if (i == bai14.fibonacci(j)) {
                        System.out.print(i + " ");
                    }
                }
            }
        }

    }
}
