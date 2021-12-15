/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsa;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cuong
 * 967,971,977
 */
public class RSA {

    /**
     * @param args the command line arguments
     */
    public static final int VERSION = 1024;
    //public static final BigInteger E = new BigInteger("65537");

    public BigInteger E;
    private BigInteger p;
    private BigInteger q;
    private BigInteger n;
    private BigInteger phiN;
    private BigInteger d;

    public void initialize() {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Moi nhap p: ");
        p = new BigInteger(sc.nextLine());
        System.out.print("Moi nhap q: ");
        q = new BigInteger(sc.nextLine());
        System.out.print("Moi nhap e: ");
        E = new BigInteger(sc.nextLine());
        //p=BigInteger.probablePrime(VERSION/2, new Random());
        //q=BigInteger.probablePrime(VERSION/2, new Random());
        n = p.multiply(q);
        phiN = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
        d = E.modInverse(phiN);
        System.out.println("Khoa cong khai: {"+E +", "+n +"}");
        System.out.println("Khoa bi mat: {"+d +", "+n +"}");
    }

    public BigInteger maHoa(BigInteger message, BigInteger partnerN, BigInteger e) {
        return message.modPow(e, partnerN);
    }
    
    public BigInteger giaiMa (BigInteger matMa, BigInteger D, BigInteger N){
        return matMa.modPow(D, N);
    }

    public BigInteger getN() {
        return n;
    }

}
