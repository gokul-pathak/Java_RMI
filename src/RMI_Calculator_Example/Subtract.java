package RMI_Calculator_Example;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Subtract extends Remote {
     public int sub(int n3, int n4) throws RemoteException;
}