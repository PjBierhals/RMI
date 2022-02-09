package rmi;


import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pjbie
 */
public interface Calculadora extends Remote{

 
    public double soma(double a, double b)throws RemoteException;
    public double subtrai(double a, double b)throws RemoteException;
    public double multiplica(double a, double b)throws RemoteException;
    public double dividi(double a, double b)throws RemoteException;
    public double raiz(double a)throws RemoteException;
    
}
