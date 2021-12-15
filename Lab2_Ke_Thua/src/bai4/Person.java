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
public class Person {

    private String name;
    private int age;
    private String profession;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    
    public Person(String initName, int initAge) {
        this.name = new String(initName);
        this.age = initAge;
        this.profession = new String("Unemployed");
    }

    public void setProfession(String newProfession) {
        this.profession = new String(newProfession);
    }

    public void displayPerson() {
        System.out.println("Full name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Profession: " + this.profession);
    }

}
