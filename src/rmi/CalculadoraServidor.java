package rmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pjbie
 */
public class CalculadoraServidor {

    public CalculadoraServidor() {
        try {
            System.setProperty("java.rmi.sever.hostname", "localhost");
            LocateRegistry.createRegistry(1099);
            Calculadora c = new CalculadoraMetodos();
            Naming.bind("RMIService", (Remote) c);

        } catch (MalformedURLException | AlreadyBoundException | RemoteException e) {
        }
    }

    public void main(String[] args) {
        
        new CalculadoraServidor();
    
    }

}
