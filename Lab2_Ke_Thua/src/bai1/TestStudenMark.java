/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author C
 */
public class TestStudenMark {

    public static void main(String[] args) {
        StudentMark st = new StudentMark();
        st.nhap();
        StudentMark stq = new StudentMark(1, "Nguyen Quyen", "abc", "tin", 9);
        System.out.println("----------------------------------------------------");;
        System.out.println("thong tin sinh vien 1;");
        st.hienthi();
        System.out.println("thong tin sinh vien 2 :");
        stq.hienthi();
        //tim kiem nguoi co diem cao nhat
        StudentMark stTest = (st.getDiem() > stq.getDiem()) ? st : stq;
        System.out.println("thong tin nguoi co diem lon nhat la :");
        stTest.hienthi();
    }

}
