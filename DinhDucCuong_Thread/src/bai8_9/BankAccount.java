///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package bai8_9;
//
//import static java.rmi.server.LogStream.log;
//import java.util.Observable;
//
///**
// *
// * @author cuong
// */
//public class BankAccount extends Observable {
//
//    private int balance; //số dư ban đầu
////Phương thức thiết lập số dư  
//
//    public void setBalance(int balance) {
//        this.balance = balance;
//        setChanged();
//        notifyObServers(null);
//    }
//    //Phương thức nạp tiền vào tài khoản    
//
//    public void deposit(int amount, BankAccountUser user) {
//        log("\n" + user.getName() + " Depositing $" + amount);
//        int newBalance = balance + amount;
//        balance = balance + amount;
//        log(". Balance = " + balance);
//        checkFinished(user);
//        assert (balance == newBalance);
//    }
////Phương thức rút tiền
//
//    public void withdraw(int amount, BankAccountUser user) {
//        log("\n" + user.getName() + " Withdrawing $" + amount);
//        if (amount > balance) {
//            throw new RuntimeException("Amount (" + amount + ") must not be greater than " + balance + ".");
//        }
//        int newBalance = balance - amount;
//        balance = balance - amount;
//        log(". Balance = " + balance);
//        checkFinished(user);
//        assert (balance == newBalance);
//    }
////Phương thức trả về số dư
//
//    public int getBalance() {
//        return balance;
//    }
//    private void checkFinished(BankAccountUser user) {
//        if ( user.isOneMore() ) {
//            log("\n****\n " + user.getName() +  " finished.\*******");
//            user.setFinished(true);
//        }
//    }
////Phương thức theo dõi tín hiệu từ tài khoản bằng cách gửi đến tất cả các đối tượng đang  quan sát.
//private void log(String message) {
//        setChanged();
//        notifyObServers(message);
//}
//}
////Phương thức kiểm tra kết thúc
//
