/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.util.Scanner;

/**
 *
 * @author cuong
 */
public class TheHienXinChao implements XinChao {

    @Override
    public String sayHello() throws Exception {
        return "Xin chao cac ban 12a1 ";
    }

    @Override
    public String GoodBye() throws RemoteException {
        return "Tam biet!";
    }

    @Override
    public int nhap() throws RemoteException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so: ");
        return sc.nextInt();
    }

    @Override
    public int binhphuong(int a) throws RemoteException {
        return a*a;
    }

}
