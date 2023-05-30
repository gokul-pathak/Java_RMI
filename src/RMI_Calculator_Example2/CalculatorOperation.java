package RMI_Calculator_Example2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculatorOperation extends Remote {
    int add(int a, int b) throws RemoteException;
    int subtract(int a, int b) throws RemoteException;
    int multiply(int a, int b) throws RemoteException;
    int divide(int a, int b) throws RemoteException;

}
