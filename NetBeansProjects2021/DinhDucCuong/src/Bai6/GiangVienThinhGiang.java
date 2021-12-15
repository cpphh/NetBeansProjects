/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

import java.util.Scanner;

/**
 *
 * @author C
 */
public class GiangVienThinhGiang extends GiangVien {

    String coQuan;

    public GiangVienThinhGiang() {
    }

    public GiangVienThinhGiang(String coQuan) {
        this.coQuan = coQuan;
    }

    public GiangVienThinhGiang(String coQuan, String ten, String email, String diachi, long sdt, long gioGiangDay) {
        super(ten, email, diachi, sdt, gioGiangDay);
        this.coQuan = coQuan;
    }

    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        System.out.print("Mời nhập cơ quan: ");
        coQuan = scanner.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println(", Cơ quan: " + coQuan + ", Lương: " + tinhLuong());
    }

    @Override
    public Long tinhLuong() {
        return gioGiangDay * 200000;
    }

}
