/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author cuong
 */
public class Test {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        EmployeeList qlsv = new EmployeeList();

        int chon;
        do {
            System.out.println("==========Menu==========");
            System.out.println("1. Them nhan vien");
            System.out.println("2. Tìm kiếm nhân vien");
            System.out.println("3. Xoa nhân vien");
            System.out.println("4. Hieent thị tất cả nhân viên");
            System.out.println("0. Thoat!");
            System.out.print("Hay nhap lua chon: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1: {
                    Employee temp = new Employee();
                    break;
                }
                case 2: {
                    System.out.println("Nhap thứ tự của sv cần TKiem: ");
                    break;
                }
                case 3: {
                    System.out.println("");
                    break;
                }
                case 4: {
                    System.out.println("");
                    break;
                }
                default:
                    System.out.println("Hay nhap dung lua chon!");

            }
        } while (chon != 0);
    }
}
