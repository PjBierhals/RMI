package rmi;


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
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
public class CalculadoraCliente {
    public static void main(String[] args) {
        try {
            Calculadora c =(Calculadora) Naming.lookup("rmi://localhost:1099/RMIService");
            System.out.println("Operções");
            System.out.println("Adicionar "+ c.soma(100, 50));
            System.out.println("Subtrai "+ c.subtrai(100, 50));
            System.out.println("Multiplica "+ c.multiplica(100, 50));
            System.out.println("Dividir "+ c.dividi(100, 5));
            System.out.println("Raiz "+ c.raiz(100));
            
            
            
        } catch (MalformedURLException | NotBoundException | RemoteException e) {
        }
    }
}
