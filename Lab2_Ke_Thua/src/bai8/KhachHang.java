/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8;

import java.util.Date;

/**
 *
 * @author cuong
 */
public class KhachHang {
    public String ma;
    public String hoTen;
    public Date ngayRaHoaDon;
    public String doiTuong;
    public float soLuong;
    public float donGia;

    public KhachHang() {
    }

    public KhachHang(String ma, String hoTen, Date ngayRaHoaDon, String doiTuong, float soLuong, float donGia) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.ngayRaHoaDon = ngayRaHoaDon;
        this.doiTuong = doiTuong;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgayRaHoaDon() {
        return ngayRaHoaDon;
    }

    public void setNgayRaHoaDon(Date ngayRaHoaDon) {
        this.ngayRaHoaDon = ngayRaHoaDon;
    }

    public String getDoiTuong() {
        return doiTuong;
    }

    public void setDoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "ma=" + ma + ", hoTen=" + hoTen + ", ngayRaHoaDon=" + ngayRaHoaDon + ", doiTuong=" + doiTuong + ", soLuong=" + soLuong + ", donGia=" + donGia + '}';
    }
    
    
    
}
