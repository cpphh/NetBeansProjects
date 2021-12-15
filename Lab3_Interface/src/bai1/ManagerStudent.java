/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author cuong
 */
public class ManagerStudent extends Student{
    int n;
	Student []studen;
	public ManagerStudent(String name, int age, String nativePlace, String id, int n) {
		super(name, age, nativePlace, id);
		this.n = n;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}

	public Student[] getStuden() {
		return studen;
	}
	public void setStuden(Student[] studen) {
		this.studen = studen;
	}
	public ManagerStudent() {
		super();
	}	
		@Override
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap  vao so hoc sinh");
		n=Integer.parseInt(sc.nextLine());
		studen=new Student[n];
		for(int i=0;i<n;i++) {
			studen[i]=new Student();
			studen[i].input();
		}
	}
	@Override
	public void display() {
		for(int i=0;i<n;i++) {
		studen[i].display();		
                  }
	}

}
