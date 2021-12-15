package bai3;

import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        int a,b,c;
        float d,x1,x2;
        Scanner nhap= new Scanner(System.in);
        System.out.println("Nhap a:");
        a=Integer.parseInt(nhap.nextLine());
        System.out.println("Nhap b:");
        b=Integer.parseInt(nhap.nextLine());
        System.out.println("Nhap c:");
        c=Integer.parseInt(nhap.nextLine());
        d=b*b-4*a*c;
        if(d<0)
        {
            System.out.println("PT vo nghiem!");
        }
        else
        {
            if(d==0)
            {
                x1= b/(2*a);
                System.out.println("PT co nghiem kep:\n x1=x2= "+x1);
            }
            else
                {
                    x1=(float) ((-b+ Math.sqrt(d))/(2*a));
                    x2=(float) ((-b- Math.sqrt(d))/(2*a));
                    System.out.println("Pt co 2 nghiem:");
                    System.out.println("x1= "+x1);
                    System.out.println("x2= "+x2);
                }
        }
    }
}
