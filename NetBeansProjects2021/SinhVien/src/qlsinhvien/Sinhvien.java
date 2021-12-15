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
public class Sinhvien {
    private String name;
    private int mark;
    private String id;

    public Sinhvien() {
    }

    public Sinhvien(String name, int mark, String id) {
        this.name = name;
        this.mark = mark;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Sinhvien{" + "name=" + name + ", mark=" + mark + ", id=" + id + '}';
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập id: ");
        this.id = sc.nextLine();
        System.out.print("Mời nhập họ tên: ");
        this.name = sc.nextLine();
        System.out.print("Mời nhập điểm: ");
        this.mark = sc.nextInt();
    }
    
    public void output(){
        System.out.println(toString());
    }
}
