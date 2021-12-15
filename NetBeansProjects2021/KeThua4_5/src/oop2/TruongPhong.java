/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oop2;

import oop1.NhanVien;


/**
 *
 * @author C
 */
public class TruongPhong extends NhanVien{
    public double trachnhiem;

    
    
    public TruongPhong(double trachnhiem, String hoten, double luong) {
        super(hoten, luong);//gọi hàm tạo 2 tham số của lớp cha
        this.trachnhiem = trachnhiem;
    }
    
    //Sử dụng từ khóa super để truy xuất đến tài sản của lớp cha
    @Override
    public void xuat()//ghi đè=lớp con và lớp cha có phương thức cùng tên
    {
        super.hoten="abc";//lương để protect khác gói vẫn sử dụng được
        super.luong=15000;
        super.xuat();
        
    }
    public double luongtp()
    {
        return luong*2-thue();
    }
    public static void main(String[] args) {
        
    }
    

    
}
