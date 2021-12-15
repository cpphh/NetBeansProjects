package bai2;

import java.util.Scanner;
public class Bai2 {

    public static void main(String[] args) {
        int a,b;
        Scanner nhap= new Scanner(System.in);
        System.out.println("Nhap so a:");
        //a=nhap.nextInt();
        //nhap.nextLine();
        a= Integer.parseInt(nhap.nextLine());
        System.out.println("Nhap so b:");
        b= Integer.parseInt(nhap.nextLine());
        int tong=a+b;
        System.out.println("Tong hai so la:"+tong);
        
        float c,d;
        System.out.println("Nhap so c:");
        c= Float.parseFloat(nhap.nextLine());
        System.out.println("Nhap so d:");
        d= Float.parseFloat(nhap.nextLine());
        if(d!=0)
        {
            float thuong=c/d;
            System.out.println("Thuong cua hai so la:"+thuong);
        }
        else
        {
            System.out.println("Khong chia duoc!");
        }
        
        char kitu;
        String xau;
        System.out.println("Nhap mot ki tu tu ban phim");
        kitu= nhap.next().charAt(0);
        nhap.nextLine();
        System.out.println("In ra ki tu vua nhap "+kitu);
        //nhap.nextLine();
        System.out.println("Nhap mot xau ki tu");
        xau=nhap.nextLine().toString();
        System.out.println("In lai xau vua nhap "+xau);
        
        float r;
        System.out.println("Nhap r:");
        r=Float.parseFloat(nhap.nextLine());
        float cv,dt;
        cv=(float ) (Math.PI*2*r);
        dt=(float ) (Math.PI*Math.PI*r);
        System.out.println("Chu vi hcn:"+cv);
        System.out.println("Dien tich hcn:"+dt);
    }
}