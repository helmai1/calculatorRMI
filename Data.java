/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmicalculator;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author ASUS
 */
public class Data extends UnicastRemoteObject implements DataInterface {
       public Data() throws RemoteException
        {}
    @Override
    public double pengurangan(double bil1, double bil2) throws RemoteException {
        double kurang = bil1-bil2;
        return kurang;
    }

    @Override
    public double penambahan(double bil1, double bil2) throws RemoteException {
         double tambah = bil1+bil2;
        return tambah;
    }

    @Override
    public double pembagian(double bil1, double bil2) throws RemoteException {
         double bagi = bil1/bil2;
        return bagi;
    }

    @Override
    public double perkalian(double bil1, double bil2) throws RemoteException {
         double kali = bil1*bil2;
        return kali;
    }
    
}
