
package hdtuong;

import java.util.Scanner;

public class student {
    int msv;
    String name;
    int tuoi;

    public int getMsv() {
        return msv;
    }

    public void setMsv(int msv) {
        this.msv = msv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public student(int msv, String name, int tuoi) {
        this.msv = msv;
        this.name = name;
        this.tuoi = tuoi;
    }

    

    public student() {
    }
    
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma sinh vien: ");
        this.msv=sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten: ");
        this.name=sc.nextLine();
        System.out.println("Nhap tuoi: ");
        this.tuoi=sc.nextInt();
    }
    
    public void in(){
        System.out.println("In thong tin vua nhap: ");
        System.out.println("Ma sv: "+this.msv);
        System.out.println("Name: "+this.name);
        System.out.println("Tuoi: "+this.tuoi);
        
    }

    @Override
    public String toString() {
        return "student{" + "msv=" + msv + ", name=" + name + ", tuoi=" + tuoi + '}';
    }
    
    
    
}