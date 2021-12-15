/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

/**
 *
 * @author cuong
 */
public class TapChi extends TaiLieu{
    private int soPhatHanh,thangPhatHanh;
    public TapChi() {
    }
    public TapChi(int soPhatHanh, int thangPhatHanh, String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }
    public int getSoPhatHanh() {
        return soPhatHanh;
    }
    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }
    public int getThangPhatHanh() {
        return thangPhatHanh;
    }
    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }    

}
