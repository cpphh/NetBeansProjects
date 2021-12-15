package quanlykhachsan;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyKhachSan {
    
    public static void nhap(ArrayList quanlyKS)
    {
        KhachSan ks = new KhachSan();
        ks.nhap();
        quanlyKS.add(ks);
    }
    
    public static void xuat(ArrayList quanlyKS)
    {
        for(int i=0; i<quanlyKS.size();i++)
        {
            KhachSan ks=(KhachSan) quanlyKS.get(i);
            ks.xuat();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList quanlyKS=new ArrayList();
        int n;
        System.out.print(" Nhap n = ");
        n=sc.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.println(" Nhap thong tin cua khach hang thu "+(i+1));
            nhap(quanlyKS);
        }
        System.out.println(" Thong tin khach hang tro");
        xuat(quanlyKS);
    }
}
