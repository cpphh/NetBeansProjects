/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testoop;

import java.util.Scanner;

/**
 *
 * @author C
 */
public class NhanVien {
    public String hoten;
    public double luong;
    public double getThuNhap()
    {
        return luong;
    }
    public void nhapdl()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập tên: ");
        this.hoten=sc.nextLine();
        System.out.println("Nhập lương: ");
        this.luong=sc.nextDouble();
        
    }
    public void indl()
    {
        System.out.println("Tên: "+hoten);
        System.out.println("Lương: "+luong);
    }
    
}
