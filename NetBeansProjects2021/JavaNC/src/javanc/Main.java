/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javanc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author C
 */
public class Main {
    public static void main(String[] args) {
        
        ArrayList<Person> p = new ArrayList<Person>();
        Person p1 = new Person("stt1","Nguyễn Văn A");
        Person p2 = new Person("stt2","Đinh Văn Cường");
        Person p3 = new Person("stt3");
        Person p4 = new Person("stt1","Đinh Văn Duy");

        p.add(p1);
        p.add(p2);
        p.add(p3);
        p.add(p4);
        
        Person temp=p1;
        
        System.out.println("ID cua Person 2 la: " + temp.getID());
        System.out.println("Name của person 2 là: " + temp.getNaMe());
        
        if(p2.equals(p4)){
            System.out.println("true");
        }
        else
            System.out.println("Không bằng nhau!");
        
        String a="may con ga";
        String b="may con ga";
        if(a.equals(b)){
            System.out.println("a=b");
        }
        else
            System.out.println("a!=b");
        System.out.println("vòng for each");
        for(Person person: p)
            System.out.println(person.toString());
        
        p.remove(2);//xóa phần tử ở vị trí thứ 3 trong mảng ArrayList

        
        System.out.println("vòng for bình thường");
        for(int i=0; i<p.size(); i++)
            p.get(i).xuat();
        
        //sắp xếp mảng tăng đàn theo tên
        Collections.sort(p);
        for(int i=0; i<p.size(); i++)
            p.get(i).xuat();
        
    }
    
}
