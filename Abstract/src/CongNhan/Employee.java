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
public abstract class Employee {

    private String name;
    private float luong;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    public abstract float thuNhap();

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        this.name = sc.nextLine();
        System.out.println("Nhap luong: ");
        this.luong = sc.nextFloat();
    }

    public void xuat() {
        System.out.println("Ten: " + name);
        System.out.println("Luong: " + luong);
    }

}
