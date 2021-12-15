/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CongNhan;

import java.util.Scanner;

/**
 *
 * @author cuong
 */
public class CongNhanA extends Employee {

    private float luong;
    private int soSP;

    @Override
    public float thuNhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so san pham lam duoc trong 1 thang: ");
        this.soSP = sc.nextInt();
        this.luong = (float) (soSP * 0.5);
        return this.luong;
    }

    @Override
    public void xuat() {
        System.out.println("Luong: " + this.luong);
    }

    @Override
    public void nhap() {
        System.out.println("Nhap thong tin cho Cong Nhan A: ");
        super.nhap();
    }

}
