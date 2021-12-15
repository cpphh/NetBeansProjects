/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dongboluong;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cuong
 */
public class Thread1 extends Thread {

    ShareDuLieu shareDuLieu;

    public Thread1(ShareDuLieu shareDuLieu) {
        this.shareDuLieu = shareDuLieu;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (shareDuLieu) {
                Random rand = new Random();
                int so = rand.nextInt(100);
                shareDuLieu.number = so;
                System.out.println("T1>: " + so);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                }
                shareDuLieu.notifyAll();
                try {
                    shareDuLieu.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        System.out.println("T1 STOP");
        synchronized (shareDuLieu) {
            shareDuLieu.notifyAll();
        }

    }

}
