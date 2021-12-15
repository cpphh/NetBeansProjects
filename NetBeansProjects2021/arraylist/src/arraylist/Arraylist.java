
package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int so;
        ArrayList<Integer> songuyen=new ArrayList<Integer>();
        System.out.println("Nhap day cac so nguyen den khi co so 0: ");
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Nhap so: ");
            so=sc.nextInt();
            list.add(so);
        } while (so!=0);
        for (Integer a: songuyen) {
            System.out.print(a+" ");
        }
        */
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(23);
        a.add(45);
        System.out.println(a.get(0));
        System.out.println(a.get(1));
        System.out.println("Mang co "+ a.size()+ " phan tu");
        
    }
    
}
