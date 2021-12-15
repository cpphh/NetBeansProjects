/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtra;

import java.util.Scanner;

/**
 *
 * @author cuong
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GenericCar<CarDetail> genericCar = new GenericCar<CarDetail>();
        do {
            System.out.println("Chương trình quản lý xe");
            System.out.println("1. Thêm xe");
            System.out.println("2. Hiển thị danh sách xe");
            System.out.println("3. Xóa xe đầu tiên");
            System.out.print("Nhập lựa chọn: ");
            int luachon = sc.nextInt();
            switch (luachon) {
                case 1:
                    System.out.println("Chức năng: thêm thông tin xe");
                    CarDetail carDetail = new CarDetail();
                    carDetail.input();
                    genericCar.add(carDetail);
                    break;
                case 2:
                    System.out.println("-------Danh sách xe------");
                    if (genericCar.checkEmpty() == false) {
                        System.out.println("Số lượng xe có trong danh sách: " + genericCar.getSize());
                        genericCar.display();
                    } else {
                        System.out.println("Bạn chưa nhập thông tin xe, vui lòng thử lại !!!");
                    }
                    break;
                case 3:
                    System.out.println("Xóa thông tin xe đầu tiên");
                    if (genericCar.checkEmpty() == false) {
                        genericCar.grab();
                    } else {
                        System.out.println("Danh sách xe trống, vui lòng thêm thông tin xe!!!");
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại !!!");
                    break;
            }
        } while (true);
    }
}
