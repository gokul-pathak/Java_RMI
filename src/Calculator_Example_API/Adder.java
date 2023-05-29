package Calculator_Example_API;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Adder extends Remote {
    public int add(int n1, int n2) throws RemoteException;
}
