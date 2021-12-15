/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

/**
 *
 * @author cuong
 */
public class OverrideGenericMethods {

    public static void main(String[] arg) {
        Gen<Integer> intObject = new Gen<Integer>(88);
        Gen2<Long> longObject = new Gen2<Long>(99L);
        intObject.getObject();
        longObject.getObject();
    }

}
