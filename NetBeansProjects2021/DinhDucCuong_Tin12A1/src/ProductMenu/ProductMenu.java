
package ProductMenu;

import java.util.Scanner;

public class ProductMenu {

    public static void main(String[] args) {
        int a,n=0;
        boolean chon=true;
        Scanner nhap = new Scanner(System.in);
        Product[] dssp = new Product[50];
        do
        {
            System.out.println("Nhap lua chon: ");
            System.out.println("1. Nhap thong tin cho n san pham");
            System.out.println("2. Hien thi thong tin vua nhap");
            System.out.println("3. Sap xep thong tin giam dan theo gia");
            System.out.println("4. Thoat");
            a=nhap.nextInt();
            switch(a)
            {
                case 1:
                    System.out.print("Nhap so luong san pham:");
                    n=nhap.nextInt();
                    nhapdssp(dssp,n);
                    break;
                case 2:
                    System.out.println("In danh sach san pham:");
                    indssp(dssp,n);
                    break;
                case 3:
                    System.out.println("Danh sach da sap xep:");
                    sx(dssp,n);
                    indssp(dssp,n);
                    break;
                case 4:
                    chon=false;
                    break;
                default:
                    System.out.println("Gia tri nhap vao khong dung!");
            }
        }
        while(chon);
    }
    public static void nhapdssp(Product[] sp, int n)
    {
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cho san pham "+(i+1)+": ");
            Product sp1=new Product();
            sp1.input();
            sp[i]=sp1;
        }
    }
    public static void indssp(Product[] sp, int n)
    {
        for (int i = 0; i < n; i++) {
            sp[i].output();
            //System.out.println(sp[i].toString());
        }
    }
    public static void sx(Product[] sp, int n)
    {
        Product tg=new Product();
        for (int i = 0; i < n-1; i++)
        for (int j = i+1; j < n; j++){
            if(sp[i].getGiaban()<sp[j].getGiaban())
            {
                tg=sp[i];
                sp[i]=sp[j];
                sp[j]=tg;
            }
        }
    }
}