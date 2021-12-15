/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package manager.info;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import student.info.Student;

/**
 *
 * @author C
 */
public class ManagerStudent extends Student{
    int n;
    List<Student> student = new ArrayList<Student>();

    public ManagerStudent() {
    }

    public ManagerStudent(int n) {
        this.n = n;
    }

    public ManagerStudent(int n, String name, int Age, String nativePlace, String id) {
        super(name, Age, nativePlace, id);
        this.n = n;
    }

    @Override
    public void input() {
        System.out.print("Nhập số Student: ");
        n = scanner.nextInt();
        scanner.nextLine();
        for(int i =0; i<n; i++){
            System.out.println("Nhập thông tin cho Student " + (i+1) + ":");
            Student temp = new Student();
            temp.input();
            student.add(temp);
        }
    }

    @Override
    public void display() {
        for (Student temp : student) {
            temp.display();
        }
    }

    public void sapXep(){
        Collections.sort(student);
        for (Student student1 : student) {
            student1.display();
        }
    }
    
    public void timKiem(){
        System.out.print("Mời nhập tên cần tìm kiếm: ");
        String s = scanner.nextLine();
        for(int i=0; i< student.size(); i++){
            if(student.get(i).getName().equals(s)){
                student.get(i).display();
            }
        }
    }
    
}
