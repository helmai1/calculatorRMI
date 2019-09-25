/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmicalculator;

import java.rmi.RemoteException;
import java.rmi.Remote;

/**
 *
 * @author ASUS
 */
public interface DataInterface extends Remote{
    public double pengurangan(double bil1, double  bil2)throws RemoteException;
    public double penambahan(double bil1, double  bil2)throws RemoteException;
    public double pembagian(double bil1, double  bil2)throws RemoteException;
    public double perkalian(double bil1, double  bil2)throws RemoteException;
}
