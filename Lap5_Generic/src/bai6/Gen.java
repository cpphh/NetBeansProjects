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
public class Gen<T> {

    T ob;

    Gen(T o) {
        ob = o;
    }

    T getObject() {
        System.out.println("Gen's getObject(): ");
        return ob;
    }

}
