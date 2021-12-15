


import java.util.Scanner;
public class Bai3 {

    public static void main(String[] args) {
        int[] dayso;
        int n;
        dayso= new int[5];
      
        Scanner nhap= new Scanner(System.in);
        System.out.println("Nhap so phan tu:");
        n= nhap.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.println("Nhap so thu "+i);
            dayso[i]= nhap.nextInt();
        }
        System.out.println("Cac so da nhap:");
        for(int i=0; i<n; i++)
        {
            System.out.print(dayso[i] +" ");
        }
        
    }
    
}
