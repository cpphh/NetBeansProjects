/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mahoacaser;
import java.util.Scanner;
/**
 *
 * @author C
 */
public class MaHoaCaser {

    /**
     * @param args the command line arguments
     */
private String P="";

      private int k;

      private String C="";

      public void Nhap(){

            Scanner nhap = new Scanner(System.in);

            System.out.print("Nhập chuổi cần mã hóa: ");

            P = nhap.next();

            System.out.print("Nhập khóa K: ");

            k = nhap.nextInt();

      }

      public String MaHoa(){

            P = P.toUpperCase();//Chuyển thành chữ in hoa

            for(int i = 0;i<P.length();i++)

                  C += (char) ('A' + (P.charAt(i) - 'A' + k) % 26);

            return C;

      }

      public String GiaiMa(){

            String kq="";

            for(int i = 0;i<P.length();i++)

                  kq += (char) ('A' + (C.charAt(i) - 'A' + (26-k)) % 26);

            return kq;

      }

      public static void main(String[] args) {

            MaHoaCaser ce = new MaHoaCaser();

            ce.Nhap();

            System.out.println("Chuổi cần mã hóa: "+ce.MaHoa());

            System.out.println("Chuổi giải mã: "+ce.GiaiMa());

      }    
    
}
