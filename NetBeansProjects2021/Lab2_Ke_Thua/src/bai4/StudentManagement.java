/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

/**
 *
 * @author C
 */
public class StudentManagement {

    public static void main(String[] args) {
        Person someone = new Person("Nguyen Ha Dong", 18);
        someone.displayPerson();
        System.out.println("\nDong becomes a student at HUST");
        String name = someone.getName();
        int age = someone.getAge();
        Student bkStudent = new Student(name, age, "HUST");
        bkStudent.displayStudent();
        System.out.println("\nDong has just passed the Java Programming course");
        bkStudent.updateCredits(3);
        bkStudent.displayStudent();
    }

}
