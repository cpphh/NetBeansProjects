/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javanc;

/**
 *
 * @author C
 */
public class Person implements Comparable<Person>{
    String ID;
    String NaMe;

    public Person(String ID, String NaMe) {
        this.ID = ID;
        this.NaMe = NaMe;
    }

    public Person() {
    }

    public Person(String ID) {
        this.ID = ID;
    }

    public String getNaMe() {
        return NaMe;
    }

    public void setNaMe(String NaMe) {
        this.NaMe = NaMe;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person){
            Person p = (Person) obj;
            if(p.getID()== this.getID()&&p.getNaMe().equals(this.getNaMe()))
                return true;
            else
                return false;
        }
        else return false;
    }

    @Override
    public String toString() {
        return "Person{" + "ID=" + ID + ", NaMe=" + NaMe + '}';
    }
    
    public void xuat(){
        System.out.println("ID: " + ID + ", Name: " + NaMe);
    }

    @Override
    public int compareTo(Person o) {
        return this.NaMe.compareTo(o.getNaMe());
    }
    
    
}
