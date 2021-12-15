/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author C
 */
public class TestProduct {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> arrlist = new ArrayList<Product>();
        System.out.println("Nhap vao n: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Product a = new Product();
            a.nhap();
            arrlist.add(a);
        }
        float max = 0;
        for (Product pr : arrlist) {
            if (max < pr.getGia1Sp()) {
                max = pr.getGia1Sp();
            }
        }
        System.out.println("Thong tin mat hang co gia cao nhat la :");
        for (Product pr : arrlist) {
            if (pr.getGia1Sp() == max) {
                pr.hienthi();
            }
        }

        System.out.println("Danh sach sau khi duoc sap xep giam dan theo gia la:");
        int i = 1;
        for (Product pr : arrlist) {
            System.out.print("san pham thu :" + (i));
            pr.hienthi();
            i++;
        }
        Collections.sort(arrlist, new Comparator<Product>() {
            @Override
            public int compare(Product pr1, Product pr2) {
                if (pr1.getGia1Sp() < pr2.getGia1Sp()) {
                    return 1;
                } else {
                    if (pr1.getGia1Sp() == pr2.getGia1Sp()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });
    }
}
