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
public class Employee {
    private String ten, ma, chucVu;

    public Employee() {
    }

    public Employee(String ten, String ma, String chucVu) {
        this.ten = ten;
        this.ma = ma;
        this.chucVu = chucVu;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
    
    static String stringFormat = "%1$-20s %2$-10s %3$-15s";
    @Override
    public String toString()
    {
        return String.format(stringFormat, ten, ma, chucVu);
    } 

}
