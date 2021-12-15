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
public class Bai4 {

    public static void main(String[] args) {
        boolean check = false;
        int soDien = 0, tienDien;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("Nhap vao so Dien:");
                soDien = Integer.parseInt(sc.nextLine());
                check = true;
            } catch (java.lang.NumberFormatException e) {
                System.out.println("hay nhap dung kieu du lieu" + e.toString());
                check = false;
            }
        } while (check == false);

        if (soDien > 0 && soDien < 50) {
            tienDien = soDien * 5000;
        } else {
            tienDien = 50 * 5000 + (soDien - 50) * 1200;
        }
        System.out.println("So tien dien la: " + tienDien);

    }
}
