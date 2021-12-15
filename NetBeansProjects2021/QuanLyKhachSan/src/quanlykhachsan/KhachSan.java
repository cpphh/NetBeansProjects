/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quanlykhachsan;

import java.util.Scanner;

/**
 *
 * @author C
 */
public class KhachSan  extends Nguoi{
    Scanner sc=new Scanner(System.in);
    private int ngaytro;
    private String loaiphong;
    private int giaphong;

    public int getNgaytro() {
        return ngaytro;
    }

    public void setNgaytro(int ngaytro) {
        this.ngaytro = ngaytro;
    }

    public String getLoaiphong() {
        return loaiphong;
    }

    public void setLoaiphong(String loaiphong) {
        this.loaiphong = loaiphong;
    }

    public int getGiaphong() {
        return giaphong;
    }

    public void setGiaphong(int giaphong) {
        this.giaphong = giaphong;
    }

    public KhachSan() {
    }

    public KhachSan(int ngaytro, String loaiphong, int giaphong) {
        this.ngaytro = ngaytro;
        this.loaiphong = loaiphong;
        this.giaphong = giaphong;
    }
    
    @Override
    public void nhap()
    {
        super.nhap();
        System.out.print(" Nhap so ngay tro: ");
        ngaytro=sc.nextInt();
        sc.nextLine();
        System.out.print(" Nhap loai phong: ");
        loaiphong=sc.nextLine();
        System.out.print(" Nhap gia phong: ");
        giaphong=sc.nextInt();
    }
    
    @Override
    public void xuat()
    {
        super.xuat();
        System.out.println("\t Ngay tro: "+ngaytro+"\t Loai phong: "+loaiphong+"\t Gia phong: "+giaphong);
    }

}
