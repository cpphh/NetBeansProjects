/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author cuong
 */
public interface XinChao extends Remote {

    public String sayHello() throws Exception;

    public String GoodBye() throws RemoteException;
    
    public int nhap() throws RemoteException;
    
    public int binhphuong(int a) throws RemoteException;
}
