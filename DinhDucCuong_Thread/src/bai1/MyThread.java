/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import static java.lang.Thread.sleep;

/**
 *
 * @author cuong
 */
public class MyThread extends Thread{

    public static void main(String[] args) {
        MyThread th = new MyThread();
        th.start();
        System.out.println("This is the main thread");
    }

    @Override
    public void run() {
        int i =0;
        while (i!=5) {
            try {
                System.out.println("This is the child Thread");
                sleep(1000);
                i++;
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    
}
