/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author cuong
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Sq_noichuoi extends UnicastRemoteObject implements NoiChuoi {

    public String chuoi = "";
    public Sq_noichuoi() throws RemoteException {
    }

    @Override
    public String noichuoi(String a) throws RemoteException {
        chuoi = chuoi +a;
        return chuoi;
    }

}
