/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author cuong
 */
public class PieceWorker extends Employee {

    float soluongsanpham;
    float luong;

    public PieceWorker() {
    }

    public PieceWorker(float soluongsanpham, float luong) {
        this.soluongsanpham = soluongsanpham;
        this.luong = luong;
    }

    public float getSoluongsanpham() {
        return soluongsanpham;
    }

    public void setSoluongsanpham(float soluongsanpham) {
        this.soluongsanpham = soluongsanpham;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    
    
    @Override
    public float earnings() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong san pham");
        soluongsanpham = Float.parseFloat(sc.nextLine());
        return luong = (float) (soluongsanpham * 0.5);
    }

    @Override
    public void hienthi() {
        System.out.println("luong :" + luong);
    }

}
