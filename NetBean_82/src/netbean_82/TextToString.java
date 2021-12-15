/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbean_82;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author cuong
 */
public class TextToString {

    public static void main(String[] args) {
        System.out.println("Enter your message: ");
        Scanner inp = new Scanner(System.in);
        final String alpha = " abcdefghijklmnopqrstuvwxyz";
        String str = inp.nextLine();   //the string user input           
        String ans = "";     //the encrypted output string
        int ind1;
        int ind2;  //the index of str and ans strings
        char x;              //the character followed by ind2 in ans string
        int i = 0;
        while (i < str.length()) {
            ind1 = alpha.indexOf(str.charAt(i)); //index of str with i variable    
            
            i++;
        }
        System.out.println(ans);

    }

}
