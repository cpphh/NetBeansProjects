/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsanpham;

/**
 *
 * @author cuong
 */
public class SanPham {
    private String masp;
    private String tensp;
    private String hangsx;
    private String gia;

    public SanPham() {
    }

    public SanPham(String masp, String tensp, String hangsx, String gia) {
        this.masp = masp;
        this.tensp = tensp;
        this.hangsx = hangsx;
        this.gia = gia;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getHangsx() {
        return hangsx;
    }

    public void setHangsx(String hangsx) {
        this.hangsx = hangsx;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }
    
}
