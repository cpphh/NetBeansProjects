/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import java.util.Date;

/**
 *
 * @author cuong
 */
public class Bao extends TaiLieu{
    private Date ngayPhatHanh;
    public Bao() {
    }
    public Bao(Date ngayPhatHanh, String maTaiLieu, String tenNhaXuatBan, int  soBanPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }
    public Date getNgayPhatHanh() {
        return ngayPhatHanh;
    }
    public void setNgayPhatHanh(Date ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }        

}
