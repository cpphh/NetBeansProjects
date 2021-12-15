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
public class GiaiMa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RSA person2 = new RSA();
        
        System.out.println("Chuong trinh Giai Ma");
        System.out.print("Nhap ban ma: ");
        BigInteger banMa = new BigInteger(sc.nextLine());
        System.out.print("Nhap d: ");
        BigInteger d = new BigInteger(sc.nextLine());
        System.out.print("Nhap n: ");
        BigInteger n = new BigInteger(sc.nextLine());
        BigInteger banRo = person2.giaiMa(banMa, d, n);
        System.out.println("Ban ro: "+ banRo);
    }
}
