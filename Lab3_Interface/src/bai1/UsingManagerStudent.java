/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author cuong
 */
public class UsingManagerStudent {

    public static void main(String[] args) {
        ManagerStudent mn = new ManagerStudent();
        int n = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1 input data");
            System.out.println("2 display data");
            System.out.println("3 sort by name");
            System.out.println("4 search by name");
            System.out.println("5 exit");
            System.out.println("Nhap vao lua chon cua ban :");
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1:
                    mn.input();
                    break;
                case 2:
                    mn.display();
                    break;
                case 3:
                    if (mn == null) {
                        System.out.println("Ban Chua Nhap du lieu");
                    } else {
                        for (int i = 0; i < mn.getStuden().length - 1; i++) {
                            for (int j = i + 1; j < mn.getStuden().length; j++) {
                                if (mn.getStuden()[i].getName().compareTo(mn.getStuden()[j].getName()) < 0) {
                                    ManagerStudent tg = (ManagerStudent) mn.getStuden()[i];
                                    mn.getStuden()[i] = mn.getStuden()[j];
                                    mn.getStuden()[j] = tg;
                                }
                            }
                        }
                        mn.display();
                    }
                    break;
                case 4:
                    if (mn == null) {
                        System.out.println("Ban Chua Nhap du lieu");
                    } else {
                        String diachi;
                        System.out.println("Nhap vao Ten  ban muon tim :");
                        diachi = sc.nextLine();
                        System.out.println("Thong tin sinh vien can tim la :");
                        int dem = 0;
                        for (int i = 0; i < mn.getStuden().length; i++) {
                            if (mn.getStuden()[i].getName().equals(diachi)) {
                                mn.getStuden()[i].display();
                                dem++;
                            }
                        }
                        if (dem == 0) {
                            System.out.println("Khong co dia chi nha ban muon tim");
                        }
                    }
                    break;
                default:
                    break;
            }

        } while (n != 5);
    }

}
