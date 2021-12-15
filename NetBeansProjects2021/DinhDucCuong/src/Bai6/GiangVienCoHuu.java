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
public class GiangVienCoHuu extends GiangVien {

    long luongThoaThuan;
    long gioQuyDinh = 40;

    public GiangVienCoHuu() {
    }

    public GiangVienCoHuu(long luongThoaThuan, long gioQuyDinh) {
        this.luongThoaThuan = luongThoaThuan;
        this.gioQuyDinh = gioQuyDinh;
    }

    public GiangVienCoHuu(long luongThoaThuan, long gioQuyDinh, String ten, String email, String diachi, long sdt, long gioGiangDay) {
        super(ten, email, diachi, sdt, gioGiangDay);
        this.luongThoaThuan = luongThoaThuan;
        this.gioQuyDinh = gioQuyDinh;
    }

    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        System.out.print("Mời nhập lương thỏa thuận: ");
        luongThoaThuan = scanner.nextLong();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println(", Lương thỏa thuận: " + luongThoaThuan + ", Số giờ quy định: " + gioQuyDinh + ", Lương: " + tinhLuong());
    }

    @Override
    public Long tinhLuong() {
        if (gioGiangDay > gioQuyDinh) {
            return (luongThoaThuan + (gioGiangDay - gioQuyDinh) * 200000);
        }
        return luongThoaThuan;
    }

}
