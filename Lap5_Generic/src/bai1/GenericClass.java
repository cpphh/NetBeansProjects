/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author cuong
 */
public class GenericClass<T> {

    T ob;

    GenericClass(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }

    void showType() {
        System.out.println("Kieu cua T la " + ob.getClass().getName());
    }

}
