/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxmin;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author C
 */
public class Bai16 {

    public String convert(String str) {
        String tmp = "";
        tmp += String.valueOf(str.charAt(0)).toUpperCase();
        tmp += str.substring(1); //tmp+=str.substring(1, str.length());
        return tmp;
    }

    public static void main(String[] args) {
        String str;
        Bai16 bai16 = new Bai16();
        System.out.println("Nhap vao chuoi ki tu muon chuan hoa: ");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        StringTokenizer tok = new StringTokenizer(str, " ");
        while (tok.hasMoreTokens()) {
            System.out.print(bai16.convert(tok.nextToken()) + " ");
        }
    }

}
