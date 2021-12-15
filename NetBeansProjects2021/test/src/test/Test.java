//
//package test;
//
//import java.util.Scanner;
//
//
//public class Test {
//    public static void main(String[] args){
//        Product[] dssp=new Product[50];
//        int n;
//        Scanner nhap=new Scanner(System.in);
//        System.out.println("Nhap so san pham: ");
//        n=nhap.nextInt();
//        
//    }
//    public static void nhapdssp(Product[] sp, int n)
//    {
////        for (int i = 0; i < n; i++) {
////            Product sp[i] = new Product();
////            sp[i].input();
////            sp[i]=spnew;
////            System.out.println("=============");
////        }
//        Product a=new Product();
//        a.input();
//    }
//    
//}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Test {
    public static void main(String[] args){
        Product[] dssp = new Product[50];
        int n;// so san pham thuc te
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so san pham:");
        n=nhap.nextInt();
        System.out.println("Nhap san pham");
        nhapdssp(dssp,n);
        System.out.println("In danh sach san pham");
        indssp(dssp,n);
        if(findname(dssp,n))
            System.out.println("banh mi day! ");
        else
            System.out.println("tim thay");
        
    }
    public static void nhapdssp(Product[] sp, int n)
    {
        for (int i = 0; i < n; i++) {
            Product sp1=new Product();
            sp1.input();
            sp[i]=sp1;
        }
    }
    public static void indssp(Product[] sp, int n)
    {
        for (int i = 0; i < n; i++) {
            //sp[i].output();
            System.out.println(sp[i].toString());
            
        }
    }
    public static boolean  findname(Product[] sp, int n){
        boolean find=false;
        for (int i = 0; i < n; i++) {
            if(sp[i].getName().equalsIgnoreCase("banh mi"));
            find = true;
            break;
        }
         return find;
    }
    //public static void deleteid(Product[] sp,int n)
    //{
        
    //}
}
