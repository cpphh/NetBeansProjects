/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dongboluong;

/**
 *
 * @author cuong
 */
public class Test {

    public static void main(String[] args) {
        ShareDuLieu shareDuLieu = new ShareDuLieu();
        Thread1 t1 = new Thread1(shareDuLieu);
        Thread2 t2 = new Thread2(shareDuLieu);

        t1.start();
        t2.start();
    }
}
