package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pjbie
 */
public class CalculadoraMetodos extends UnicastRemoteObject implements Calculadora {

    private static final long serialVersionUID = 1L;

    protected CalculadoraMetodos() throws RemoteException {
        super();
    }

    @Override
    public double soma(double a, double b) throws RemoteException {
        return a + b;
    }

    @Override
    public double subtrai(double a, double b) throws RemoteException {
        return a - b;
    }

    @Override
    public double multiplica(double a, double b) throws RemoteException {
        return a * b;
    }

    @Override
    public double dividi(double a, double b) throws RemoteException {
        return a / b;
    }

    @Override
    public double raiz(double a) throws RemoteException {
        return Math.sqrt(a);
    }

}
