/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author cuong
 */
public class TwoGenericsTest {

    public static void main(String args[]) {
        TwoGenerics<Integer, String> tgObj = new TwoGenerics<Integer, String>(88, "Generics");
        tgObj.showTypes();
        int v = tgObj.getob1();
        System.out.println("gia tri: " + v);
        String str = tgObj.getob2();
        System.out.println("gia tri: " + str);
    }

}
