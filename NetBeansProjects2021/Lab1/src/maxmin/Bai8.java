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
public class Bai8 {
    int n;
    
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
    void nhap() {
        
        boolean check = false;
        Scanner sc = new Scanner(System.in);
        do {
            try {

                System.out.println("Nhap vao n:");
                n = Integer.parseInt(sc.nextLine());
                check = true;
            } catch (java.lang.NumberFormatException e) {
          System.out.println("hay nhap dung kieu du lieu" + e.toString());
                check = false;
            }
        } while (check == false);
    }
    public static void main(String[] args) {
        Bai8 bai8 = new Bai8();
        bai8.nhap();
        if(bai8.songt(bai8.n))
            System.out.println("n la So Nguyen To");
        else
            System.out.println("n khong la So Nguyen To");
        
        System.out.print("Cac so nguyen to tu 1 den n: ");
        for(int i=0; i< bai8.n; i++)
        {
            if(bai8.songt(i))
                System.out.print(" "+i);
        }
        System.out.println("");
    }
}
