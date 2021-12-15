/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author cuong
 */
public interface NoiChuoi extends Remote{
    public String noichuoi(String a) throws RemoteException;
}
