/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oop1;

/**
 *
 * @author C
 */
public class NhanVien {
    protected String hoten;
    protected double luong;

    public NhanVien(String hoten, double luong) {
        this.hoten = hoten;
        this.luong = luong;
    }
    public void xuat()
    {
    
    }
    public double thue()
    {
        return 0.1*luong;
    }
    
}
