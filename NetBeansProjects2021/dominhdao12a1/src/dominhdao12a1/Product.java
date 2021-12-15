/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominhdao12a1;

/**
 *
 * @author Diep.Tran
 */
public class Product {
    int id;
    String tensp, hangsx, ngaynhap, giaban;
    int soluong;
    
    public Product() {
    }

    public Product(int id, String tensp, String hangsx, String ngaynhap, String giaban, int soluong) {
        this.id = id;
        this.tensp = tensp;
        this.hangsx = hangsx;
        this.ngaynhap = ngaynhap;
        this.giaban = giaban;
        this.soluong = soluong;
    }

    public Product(String tensp, String hangsx, String ngaynhap, String giaban, int soluong) {
        this.tensp = tensp;
        this.hangsx = hangsx;
        this.ngaynhap = ngaynhap;
        this.giaban = giaban;
        this.soluong = soluong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public String getGiaban() {
        return giaban;
    }

    public void setGiaban(String giaban) {
        this.giaban = giaban;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

  
   
}