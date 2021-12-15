/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package student.info;

import java.util.Scanner;
import person.info.Person;

/**
 *
 * @author C
 */
public class Student implements Person, Comparable<Student>{
    String name;
    int Age;
    String nativePlace;
    String id;

    public Student() {
    }

    public Student(String name, int Age, String nativePlace, String id) {
        this.name = name;
        this.Age = Age;
        this.nativePlace = nativePlace;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    

    public static Scanner scanner = new Scanner(System.in);

    @Override
    public void input() {
        System.out.print("Mời nhập ID: ");
        id = scanner.nextLine();
        System.out.print("Mời nhập họ tên: ");
        name = scanner.nextLine();
        System.out.print("Mời nhập tuổi: ");
        Age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Mời nhập quê quán: ");
        nativePlace = scanner.nextLine();
    }

    @Override
    public void display() {
        System.out.print("ID: "+id);
        System.out.print(", Họ tên: "+name);
        System.out.print(", Tuổi: "+Age);
        System.out.println(", Quê quán: "+nativePlace);
        
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
    
}
