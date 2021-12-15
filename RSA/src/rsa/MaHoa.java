/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsa;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author cuong
 */
public class MaHoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RSA person1 = new RSA();
        
        System.out.println("Chương trình Mã Hóa");
        System.out.print("Nhap ban ro: ");
        BigInteger message = new BigInteger(sc.nextLine());
        System.out.print("e = ");
        BigInteger e = new BigInteger(sc.nextLine());
        System.out.print("n = ");
        BigInteger n = new BigInteger(sc.nextLine());
        BigInteger banMa = person1.maHoa(message, n, e);
        System.out.println("Ban ma: " + banMa);
    }
}
