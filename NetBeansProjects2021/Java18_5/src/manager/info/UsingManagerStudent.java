/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package manager.info;

import java.util.Scanner;

/**
 *
 * @author C
 */
public class UsingManagerStudent{
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        ManagerStudent a = new ManagerStudent();
        int chon;
        do{
            System.out.println("------------------------------------------------");
            System.out.println("1. Input data");
            System.out.println("2. Display data");
            System.out.println("3. Sort by name");
            System.out.println("4. Search by name");
            System.out.println("5. Exit");
            System.out.println("Nhập lựa chọn: ");
            chon = scanner.nextInt();
            scanner.nextLine();
            switch(chon){
                case 1:
                    System.out.println("----------------------------------------");
                    a.input();
                    break;
                case 2:
                    System.out.println("----------------------------------------");
                    System.out.println("In thông tin");
                    a.display();
                    break;
                case 3: 
                    System.out.println("----------------------------------------");
                    System.out.println("Sắp xếp tăng dần theo tên");
                    a.sapXep();
                    break;
                case 4:
                    System.out.println("----------------------------------------");
                    System.out.println("Tìm theo tên");
                    a.timKiem();
                    break;
                case 5:
                    System.out.println("Đã thoát!");
                    break;
                default:
                    System.out.println("Lựa chọn không đúng");
            }
        
        }while(chon != 5);
    }
    
}

