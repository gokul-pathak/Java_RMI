package RMI_Calculator_Example2;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorOpeImplement extends UnicastRemoteObject implements CalculatorOperation {
    public CalculatorOpeImplement() throws RemoteException{
        //required default constructor
    }
    public int add(int a, int b) throws RemoteException{
        return a + b;

    }
    public int subtract(int a, int b) throws RemoteException{
        return a -b;
    }
    public int divide(int a, int b) throws RemoteException{
        return a/b;
    }
    public int multiply(int a, int b) throws RemoteException{
        return a*b;
    }
}
