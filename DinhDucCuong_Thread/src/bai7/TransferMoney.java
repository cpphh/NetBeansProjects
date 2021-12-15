/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import java.util.Random;

/**
 *
 * @author cuong
 */
public class TransferMoney implements Runnable{

    Bank bank;
    int fromAcc;
    double maxAmount;
    int delay = 1000;

    public TransferMoney(Bank bank, int fromAcc, double maxAmount) {
        this.bank = bank;
        this.fromAcc = fromAcc;
        this.maxAmount = maxAmount;

    }

    @Override
    public void run() {
        Random rd = new Random();
        int toAcc = 0;
        double amount = 0;
        try {
            while (true) {
                do {
                    toAcc = rd.nextInt(bank.size());
                } while (toAcc == fromAcc);
                amount = rd.nextInt((int) maxAmount);
                bank.transfer(fromAcc, toAcc, amount);
                Thread.sleep(rd.nextInt(delay));
            }
        } catch (InterruptedException ex) {
            System.out.println("Giao dịch chuyển tiền từ account " + fromAcc + " sang account " + toAcc + " bị gián đoạn");
        }
    }

}
