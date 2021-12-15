package baitap;

import java.util.Scanner;

public class Baitap {

    public class StudentMark {

        int Rollnumber;
        String hoten;
        String lop;
        String mon;
        float diem;

        public int getRollnumber() {
            return Rollnumber;
        }

        public void setRollnumber(int Rollnumber) {
            this.Rollnumber = Rollnumber;
        }

        public String getHoten() {
            return hoten;
        }

        public void setHoten(String hoten) {
            this.hoten = hoten;
        }

        public String getLop() {
            return lop;
        }

        public void setLop(String lop) {
            this.lop = lop;
        }

        public String getMon() {
            return mon;
        }

        public void setMon(String mon) {
            this.mon = mon;
        }

        public float getDiem() {
            return diem;
        }

        public void setDiem(float diem) {
            this.diem = diem;
        }

        public StudentMark() {
        }

        public StudentMark(int Rollnumber, String hoten, String lop, String mon, float diem) {
            this.Rollnumber = Rollnumber;
            this.hoten = hoten;
            this.lop = lop;
            this.mon = mon;
            this.diem = diem;
        }

        @Override
        public String toString() {
            return "StudentMark{" + "Rollnumber=" + Rollnumber + ", hoten=" + hoten + ", lop=" + lop + ", mon=" + mon + ", diem=" + diem + '}';
        }

        public void nhap() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap Rollnumber: ");
            this.Rollnumber = sc.nextInt();
            System.out.println("Nhap ho ten: ");
            this.hoten = sc.nextLine();
            System.out.println("Nhap lop: ");
            this.lop = sc.nextLine();
            System.out.println("Nhap mon: ");
            this.lop = sc.nextLine();
            System.out.println("Nhap diem: ");
            this.diem = sc.nextFloat();

        }

        public void in() {
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        //StudentMark a = new StudentMark();
        System.out.println("ga");

    }

}
