/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cuong
 */
public class Client_XinChao {

    public static void main(String[] args) {
        try {
            Registry regis = LocateRegistry.getRegistry(12345);
            XinChao stub = (XinChao) regis.lookup("xinchao");
            String a = stub.sayHello();
            String b = stub.GoodBye();
            int num = stub.nhap();
            
            System.out.println("Binh phuong cua so a: "+ stub.binhphuong(num));
            System.out.println("Phan hoi tu phia Server " + a);
            System.out.println("Phan hoi tu phia Server tiep " + b);

        } catch (Exception ex) {
            Logger.getLogger(Client_XinChao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
