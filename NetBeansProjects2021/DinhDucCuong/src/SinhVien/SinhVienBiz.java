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
public class SinhVienBiz extends SinhVienPoly {

    double diemMarketing;
    double diemSales;

    public SinhVienBiz() {
    }

    public SinhVienBiz(double diemMarketing, double diemSales) {
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    public SinhVienBiz(double diemMarketing, double diemSales, String ten, String nganh) {
        super(ten, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem() {
        return (2 * diemMarketing + diemSales) / 3;
    }
    
    @Override
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        System.out.print("Mời nhập điểm Marketing: ");
        diemMarketing = scanner.nextDouble();
        System.out.print("Mời nhập điểm Sales: ");
        diemSales = scanner.nextDouble();
    }
    
    @Override
    public void xuat(){
        super.xuat();
        System.out.println(", Điểm Marketing " + diemMarketing + ", Điểm Sales " + diemSales);
    }

}
