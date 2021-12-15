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
public class Student extends Person {

    private String university;
    private int credits;

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Student(String initName, int initAge, String initUniversity) {
        super(initName, initAge);
        super.setProfession("Student");
        this.university = initUniversity;
        credits = 0;
    }

    public void updateCredits(int moreCredits) {
        this.credits += moreCredits;
    }

    public void displayStudent() {
        super.displayPerson();
        System.out.println("University: " + this.university);
        System.out.println("Cumulated credits: " + this.credits);
    }

}
