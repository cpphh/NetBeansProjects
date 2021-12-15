/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinhVien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author C
 */
public class Main {
    
    public static void main(String[] args) {
        int choiceNumber;
        int sv = 0;
        Scanner scanner = new Scanner(System.in);
        SinhVienPoly[] svpl = new SinhVienPoly[100];

        for (;;) {
            System.out.println("------------------------------------------------");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Xuất thông tin sinh viên");
            System.out.println("3. Xuất danh sách sinh viên có học lực Giỏi");
            System.out.println("4. Sắp xếp danh sách sinh viên theo điểm");
            System.out.println("5. Kết thúc");
            System.out.println("------------------------------------------------");

            do {
                System.out.print("Bấm số để chọn (1/2/3/4/5): ");
                choiceNumber = scanner.nextInt();
            } while ((choiceNumber < 1) || (choiceNumber > 5));

            switch (choiceNumber) {
                case 1:
                    System.out.println("----------------------------------------");
                    System.out.print("Mời nhập số sinh viên: ");
                    sv = scanner.nextInt();

                    for (int i = 0; i < sv; i++) {
                        System.out.print("Nhập thông tin cho SINH VIÊN IT(1) / SINH VIÊN BIZ(2) ");
                        int chon = scanner.nextInt();
                        scanner.nextLine();
                        if (chon == 1) {
                            svpl[i] = new SinhVienIT();
                        } else if (chon == 2) {
                            svpl[i] = new SinhVienBiz();
                        }
                        svpl[i].nhap();
                    }
                    break;
                case 2:
                    System.out.println("----------------------------------------");
                    System.out.println("========= Xuất thông tin Sinh Viên =========");
                    for (int i = 0; i < sv; i++) {
                        svpl[i].xuat();
                    }
                    break;
                case 3:
                    System.out.println("----------------------------------------");
                    System.out.println("========= Sinh Viên học lực GIỎI =========");
                    for (int i = 0; i < sv; i++) {
                        if (svpl[i].getHocLuc() == "Giỏi") {
                            svpl[i].xuat();
                        }
                    }
                    break;
                case 4:
                    System.out.println("========= Sinh Viên sắp xếp theo điểm =========");
                    for (int i = 0; i < sv - 1; i++) {
                        for (int j = i + 1; j < sv; j++) {
                            if (svpl[i].getDiem() > svpl[j].getDiem()) {
                                SinhVienPoly tg = svpl[i];
                                svpl[i] = svpl[j];
                                svpl[j] = tg;
                            }
                        }
                    }
                    for(int i=0; i<sv; i++)
                        svpl[i].xuat();
                    break;
                case 5:
                    System.out.println("ĐÃ KẾT THÚC!");
                    System.exit(0);
                    break;
            }
        }
    }

}
