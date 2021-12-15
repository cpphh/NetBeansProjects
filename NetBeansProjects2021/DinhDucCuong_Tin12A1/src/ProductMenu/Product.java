/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ProductMenu;

import java.util.Scanner;

/**
 *
 * @author C
 */
public class Product {
    String tenhanghoa;
    String nhasx;
    int giaban;

    public Product() {
    }

    public Product(String tenhanghoa, String nhasx, int giaban) {
        this.tenhanghoa = tenhanghoa;
        this.nhasx = nhasx;
        this.giaban = giaban;
    }

    public String getTenhanghoa() {
        return tenhanghoa;
    }

    public String getNhasx() {
        return nhasx;
    }

    public int getGiaban() {
        return giaban;
    }

    public void setTenhanghoa(String tenhanghoa) {
        this.tenhanghoa = tenhanghoa;
    }

    public void setNhasx(String nhasx) {
        this.nhasx = nhasx;
    }

    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }
    
    public void input()
    {
       Scanner nhapdl = new Scanner(System.in);
        System.out.print("Nhap ten hang hoa: ");
        this.tenhanghoa=nhapdl.nextLine();
        System.out.print("Nhap nha san xuat: ");
        this.nhasx=nhapdl.nextLine();
        System.out.print("Nhap gia ban: ");
        this.giaban=nhapdl.nextInt();
    }
    
    public void output()
    {
        System.out.println("Ten hang hoa:"+this.tenhanghoa);
        System.out.println("Nha sx:"+this.nhasx);
        System.out.println("Gia ban:"+this.giaban);
    }
    
}
