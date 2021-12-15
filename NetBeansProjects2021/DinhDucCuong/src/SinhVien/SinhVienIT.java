/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinhVien;

import java.util.Scanner;

/**
 *
 * @author C
 */
public class SinhVienIT extends SinhVienPoly {

    double diemJava;
    double diemHtml;
    double diemCss;

    public SinhVienIT() {
    }

    public SinhVienIT(double diemJava, double diemHtml, double diemCss) {
        this.diemJava = diemJava;
        this.diemHtml = diemHtml;
        this.diemCss = diemCss;
    }

    public SinhVienIT(double diemJava, double diemHtml, double diemCss, String ten, String nganh) {
        super(ten, nganh);
        this.diemJava = diemJava;
        this.diemHtml = diemHtml;
        this.diemCss = diemCss;
    }

    @Override
    public double getDiem() {
        return (2 * diemJava + diemHtml + diemCss) / 4;
    }

    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        System.out.print("Mời nhập điểm Java: ");
        diemJava = scanner.nextDouble();
        System.out.print("Mời nhập điểm Html: ");
        diemHtml = scanner.nextDouble();
        System.out.print("Mời nhập điểm Css: ");
        diemCss = scanner.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println(", Điểm Java: " + diemJava + ", Điểm Html: " + diemHtml + ", Điểm Css: " + diemCss);
    }

}
