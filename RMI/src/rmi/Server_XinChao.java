/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cuong
 */
public class Server_XinChao {

    public static void main(String[] args) {
        TheHienXinChao obj = new TheHienXinChao();
        System.out.println("Server san sang lam viec ");
        try {
            XinChao stub = (XinChao) UnicastRemoteObject.exportObject(obj, 12345);
            Registry re = LocateRegistry.createRegistry(12345);
            re.bind("xinchao", stub);
        } catch (Exception ex) {
            Logger.getLogger(Server_XinChao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
