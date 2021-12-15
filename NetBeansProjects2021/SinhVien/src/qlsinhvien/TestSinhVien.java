/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsinhvien;

import java.util.Scanner;

/**
 *
 * @author C
 */
public class TestSinhVien {
    public static void main(String[] args) {
        Sinhvien sv = new Sinhvien();
        Sinhvien sv1 = new Sinhvien("Tuan", 8, "TI001");
        sv.input();
        sv.output();
        sv1.output();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        Sinhvien[] arrSV = new Sinhvien[n];
        for(int i =0; i<n; i++){
            arrSV[i] = new Sinhvien();
            arrSV[i].input();
        }
        System.out.println("Danh sách SV vừa nhập: ");
        for(Sinhvien a: arrSV)
            a.output();
        
        Sinhvien temp;
        for(int i=0; i<n-1; i++)
            for(int j=i+1; j<n; j++)
                if(arrSV[i].getMark()>arrSV[j].getMark()){
                    temp = arrSV[i];
                    arrSV[i]=arrSV[j];
                    arrSV[j]=temp;
                }
        System.out.println("Danh sách SV sau khi sắp xếp tăng dần theo điểm: ");
        for(Sinhvien a: arrSV)
            a.output();
        
    }
}
