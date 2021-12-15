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
public class Nguoi {
    Scanner sc= new Scanner(System.in);
    private String hoten;
    private int tuoi;
    private int namsinh;
    private String cmt;

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public String getCmt() {
        return cmt;
    }

    public void setCmt(String cmt) {
        this.cmt = cmt;
    }

    public Nguoi() {
    }

    public Nguoi(String hoten, int tuoi, int namsinh, String cmt) {
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.namsinh = namsinh;
        this.cmt = cmt;
    }
    
    public void nhap()
    {
        System.out.print(" Nhap vao ho va ten: ");
        hoten=sc.nextLine();
        System.out.print(" Nhap so chung minh thu: ");
        cmt=sc.nextLine();
        System.out.print(" Nhap tuoi: ");
        tuoi=sc.nextInt();
        System.out.print(" Nhap nam sinh: ");
        namsinh=sc.nextInt();
        
    }
    
    public void xuat()
    {
        System.out.println("\t Ho va ten: "+hoten+"\t So chung minh thu: "+cmt+"\t Tuoi: "+tuoi+"\t Nam sinh: "+namsinh);
    }
    
}
