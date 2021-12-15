package bai4;
import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        int a, b;
        float x,y;
        Scanner nhap= new Scanner(System.in);
        System.out.println("Nhap vao so a");
        a=nhap.nextInt();
        System.out.println("Nhap vao so b");
        b= nhap.nextInt();
        int tong=a+b;
        System.out.println("Tong cua hai so: "+tong);
        int[] dayso= new int[50];
        int n;
        System.out.println("Nhap so phan tu tu  ban phim: ");
        n=nhap.nextInt();
        for(int i =0; i<n; i++){
            System.out.println("Nhap phan tu thu "+(i+1));
            dayso[i]=nhap.nextInt();
        }
        System.out.println("In lai day vua nhap:");
        inmang(dayso,n);
        System.out.println("\nTong cac phan tu:");
        System.out.println(tong(dayso,n));
    }
    public static int tong(int[] a, int n)
    {
        int s=0;
        for(int i=0; i<n; i++){
            s+=a[i];
        }
        return s;
    }
    public static boolean ktchan(int n)
    {
        if(n%2==1)
            return false;
        return true;
    }
    public static void inmang(int[] a, int n)
    {
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
    }
}



