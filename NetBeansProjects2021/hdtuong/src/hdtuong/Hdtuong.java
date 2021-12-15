
package hdtuong;

import java.util.ArrayList;
import java.util.Scanner;

public class Hdtuong{
   
   
    public static void main(String[] args) {
        // TODO code application logic here
        ////student sv= new student();
        /*Student sv2= new Student("cuong",20,"181031");
        System.out.println("ten sv1:"+ sv1.name);
        sv1.setName("Tuan");
        sv1.setTuoi(30);
        sv1.setMsv("2021");
        System.out.println("Ten:"+sv1.getName()+"Tuoi:"+sv1.getTuoi);
                */
        //sv.setName("abc");
        //System.out.println("Ten: "+sv.name);
        Scanner sc=new Scanner(System.in);
        ArrayList<student> ds= new ArrayList<student>();
        int n,i=0;
        System.out.println("Nhap so student: ");
        n=sc.nextInt();
        sc.nextLine();
        do{
            System.out.println("Nhap thong tin cho sinh vien thu: "+(i+1));
            student sv =new student();
            sv.nhap();
            ds.add(sv);
            i++;
        }
        while(i<n);
        for(student sv : ds){
            sv.in();
        }
        //Xoa mot stdudent
        int vitri;
        System.out.println("Nhap vi tri can xoa: ");
        vitri=sc.nextInt();
        ds.remove(vitri);
        System.out.println("In lai danh sach sau khi xoa: ");
        for(student sv : ds){
            //sv.toString();
            sv.in();
        }
        
    }
    
}
