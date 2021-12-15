/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dongboluong;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cuong
 */
public class Thread2 extends Thread {

    ShareDuLieu shareDuLieu;

    public Thread2(ShareDuLieu shareDuLieu) {
        this.shareDuLieu = shareDuLieu;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (shareDuLieu) {
                int so = (int) Math.pow(shareDuLieu.number, 2);
                System.out.println("T2>: " + so);

                shareDuLieu.notifyAll();
                try {
                    shareDuLieu.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        System.out.println("T2 STOP");
    }
}
