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
public class Boss extends Employee {

    private float luong;

    public void setLuong(float luong) {
        this.luong = luong;
    }

    @Override
    public void xuat() {
        System.out.println("Luong: " + this.luong);
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin cho Boss:");
        super.nhap(); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public float getLuong() {
        return super.getLuong(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float thuNhap() {
        return this.luong = 5000000;
    }

}
