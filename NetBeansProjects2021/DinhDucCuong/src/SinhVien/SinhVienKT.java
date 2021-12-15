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
public class SinhVienKT extends SinhVienPoly {

    double diemTA;
    double diemMarketing;
    double diemQTDN;

    public SinhVienKT() {
    }

    public SinhVienKT(double diemTA, double diemMarketing, double diemQTDN) {
        this.diemTA = diemTA;
        this.diemMarketing = diemMarketing;
        this.diemQTDN = diemQTDN;
    }

    public SinhVienKT(double diemTA, double diemMarketing, double diemQTDN, String ten, String nganh) {
        super(ten, nganh);
        this.diemTA = diemTA;
        this.diemMarketing = diemMarketing;
        this.diemQTDN = diemQTDN;
    }

    @Override
    public void xuat() {
        super.xuat(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Điểm TA: " + diemTA + ", Điểm Marketing: " + diemMarketing + ", Điểm QTDN: " + diemQTDN + ", Điểm TB: " + getDiem());
    }

    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        super.nhap(); //To change body of generated methods, choose Tools | Templates.
        System.out.print("Nhập điểm TA: ");
        diemTA = scanner.nextDouble();
        System.out.print("Nhập điểm Marketing: ");
        diemMarketing = scanner.nextDouble();
        System.out.print("Nhập điểm QTDN: ");
        diemQTDN = scanner.nextDouble();

    }

    @Override
    public double getDiem() {
        return (2 * diemTA + 2 * diemQTDN + diemMarketing) / 5;
    }

}
