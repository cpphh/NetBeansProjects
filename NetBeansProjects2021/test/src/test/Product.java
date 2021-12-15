//
//package test;
//
//import java.util.Scanner;
//
//public class Product {
//    public String id;
//    public String name;
//    public int soluong;
//    public float dongia;
//
//    public Product(String id, String name, int soluong, float dongia) {
//        this.id = id;
//        this.name = name;
//        this.soluong = soluong;
//        this.dongia = dongia;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getSoluong() {
//        return soluong;
//    }
//
//    public void setSoluong(int soluong) {
//        this.soluong = soluong;
//    }
//
//    public float getDongia() {
//        return dongia;
//    }
//
//    public void setDongia(float dongia) {
//        this.dongia = dongia;
//    }
//    
//    
//    public void input(){
//        Scanner nhap1=new Scanner(System.in);
//        System.out.println("Nhap id san pham: ");
//        this.id=nhap1.nextLine();
//        System.out.println("Nhap ten san pham: ");
//        this.name=nhap1.nextLine();
//        System.out.println("Nhap so luong: ");
//        this.soluong=nhap1.nextInt();
//        System.out.println("Nhap gia tien: ");
//        this.dongia=nhap1.nextFloat();
//    }
//    public void output()
//    {
//        System.out.println("");
//    }
//
//    
////    public static void main(String[] args) {
////        // TODO code application logic here
////        Product a=new Product("123","cuong",5,200f);
////        System.out.println("ten: "+a.name);
////    }
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
public class Product {
    String id;
    String name;
    int soluong;
    float dongia;
    
    public Product(){
    }

    public Product(String id, String name, int soluong, float dongia) {
        this.id = id;
        this.name = name;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }
    public void input()
    {
       Scanner nhapdl = new Scanner(System.in);
        System.out.println("Nhap id san pham");
        this.id=nhapdl.nextLine();
        System.out.println("Nhap ten san pham");
        this.name=nhapdl.nextLine();
        System.out.println("Nhap so luong");
        this.soluong=nhapdl.nextInt();
        System.out.println("Nhap don gia");
        this.dongia=nhapdl.nextFloat();
        
    }

    public void output()
    {
        System.out.println("id:"+this.id);
        System.out.println("Ten:"+this.name);
        System.out.println("So luong:"+this.soluong);
        System.out.println("Don gia:"+this.dongia);
            
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", soluong=" + soluong + ", dongia=" + dongia + '}';
    }
    
}

