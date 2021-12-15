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
public class TestSinhvien {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        DanhSachSinhvien qlsv = new DanhSachSinhvien();

        int chon;
        do {
            System.out.println("==========Menu==========");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Sua sinh vien");
            System.out.println("3. Xoa sinh vien");
            System.out.println("4. Sap xep theo ma SV");
            System.out.println("5. Số lượng SV có trong DS");
            System.out.println("6. Tìm kiếm SV theo lớp");
            System.out.println("0. Thoat!");
            System.out.print("Hay nhap lua chon: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1: {
                    Sinhvien temp = new Sinhvien();
                    temp.nhap();
                    qlsv.addSinhvien(temp);
                    System.out.println(qlsv.toString());
                    break;
                }
                case 2: {
                    System.out.println("Nhap thứ tự của sv cần Sua: ");
                    int n = sc.nextInt();
                    Sinhvien temp = new Sinhvien();
                    temp.nhap();
                    qlsv.updateSinhvien(n, temp);
                    System.out.println(qlsv.toString());
                    break;
                }
                case 3: {
                    System.out.print("Nhap ma sv muon Xoa: ");
                    sc.nextLine();
                    String a = sc.nextLine();
                    qlsv.removeSinhvien(a);
                    System.out.println(qlsv.toString());
                    break;
                }
                case 4: {
                    qlsv.sort();
                    System.out.println(qlsv.toString());
                    break;
                }
                case 5: {
                    System.out.println("Có " + qlsv.soLuong() + " SV trong DS");
                    break;
                }
                case 6: {
                    System.out.println("Nhập lớp cần tìm kiếm: ");
                    sc.nextLine();
                    String temp = sc.nextLine();
                    System.out.println(qlsv.findSinhvien2(temp));
                    break;
                }
                default:
                    System.out.println("Hay nhap dung lua chon!");

            }
        } while (chon != 0);
        System.out.println("Xong!!!!");

        /*
        Sinhvien teo = new Sinhvien();
        teo.setMasv("113");
        teo.setTensv("Nguyễn Văn Tèo");
        qlsv.addSinhvien(teo);

        Sinhvien sv = new Sinhvien();
        sv.setMasv("115");
        sv.setTensv("Nguyễn Thị tý");
        qlsv.addSinhvien(sv);

        Sinhvien ty = new Sinhvien();
        ty.setMasv("114");
        ty.setTensv("Nguyễn Thị tý");
        qlsv.addSinhvien(ty);
        System.out.println(qlsv);

        System.out.println("Sap xep tang dan theo ma:");
        qlsv.sort();
        System.out.println(qlsv);
         */
    }

}
