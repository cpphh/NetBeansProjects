/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author C
 */
public class StudentMark {

    private int Rollnumber;
    private String hoTen;
    private String lop;
    private String mon;
    private float diem;

    public StudentMark() {
    }

    public StudentMark(int Rollnumber, String hoTen, String lop, String mon, float diem) {
        this.Rollnumber = Rollnumber;
        this.hoTen = hoTen;
        this.lop = lop;
        this.mon = mon;
        this.diem = diem;
    }

    public int getRollnumber() {
        return Rollnumber;
    }

    public void setRollnumber(int Rollnumber) {
        this.Rollnumber = Rollnumber;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "StudentMark{" + "Rollnumber=" + Rollnumber + ", hoTen=" + hoTen + ", lop=" + lop + ", mon=" + mon + ", diem=" + diem + '}';
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao Rollnumber");
        Rollnumber = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap vao ho ten :");
        hoTen = sc.nextLine();
        System.out.print("Nhap vao ten lop  :");
        lop = sc.nextLine();
        System.out.print("Nhap vao ten mon hoc :");
        mon = sc.nextLine();
        boolean check = false;
        do {
            try {
                System.out.println("Nhap vao diem :");
                diem = Float.parseFloat(sc.nextLine());
                check = true;
                if (diem < 0 || diem > 10) {
                    check = false;
                }
            } catch (java.lang.NumberFormatException e) {
                System.out.println("hay nhap dung kieu du lieu" + e.toString());
                check = false;
            }
        } while (check == false);
    }

    public void hienthi() {
        System.out.println("rollnumber :" + Rollnumber);
        System.out.println("ho ten :" + hoTen);
        System.out.println("ten lop :" + lop);
        System.out.println("ten mon hoc :" + mon);
        System.out.println("Nhap diem :" + diem);
    }
}
