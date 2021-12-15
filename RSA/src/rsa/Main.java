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
 * 967,971,977
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RSA person2 = new RSA();
        
        person2.initialize();
        
        /*System.out.print("Nhap ban ro: ");
        BigInteger message = new BigInteger(sc.nextLine());
        System.out.print("e = ");
        BigInteger e = new BigInteger(sc.nextLine());
        System.out.print("n = ");
        BigInteger n = new BigInteger(sc.nextLine());
        BigInteger banMa = person1.maHoa(message, n, e);
        System.out.println("Ban ma: " + banMa);
        
        System.out.println("Nhap ban ma: ");
        BigInteger banRo = person2.giaiMa(banMa);
        System.out.println("Ban ro: "+ banRo);*/
        
    }
}
