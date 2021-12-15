/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9;

/**
 *
 * @author cuong
 */
public class HREmployee extends Employee{
    String tenPhongBan, maPhongBan;

    public HREmployee() {
    }

    public HREmployee(String tenPhongBan, String maPhongBan) {
        this.tenPhongBan = tenPhongBan;
        this.maPhongBan = maPhongBan;
    }

    public HREmployee(String tenPhongBan, String maPhongBan, String ten, String ma, String chucVu) {
        super(ten, ma, chucVu);
        this.tenPhongBan = tenPhongBan;
        this.maPhongBan = maPhongBan;
    }

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    public String getMaPhongBan() {
        return maPhongBan;
    }

    public void setMaPhongBan(String maPhongBan) {
        this.maPhongBan = maPhongBan;
    }

    public static String getStringFormat() {
        return stringFormat;
    }

    public static void setStringFormat(String stringFormat) {
        Employee.stringFormat = stringFormat;
    }

    static String stringFormat = "%1$-20s %2$-10s";
    public String toString()
    {
     return super.toString() + String.format(stringFormat, tenPhongBan, maPhongBan);
    }

    
}
