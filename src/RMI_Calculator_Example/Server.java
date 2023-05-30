package RMI_Calculator_Example;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements Adder {
    public Server() throws RemoteException{
        super();
    }

    public int add(int n1, int n2) throws RemoteException
    {
            return n1 + n2;
    }
    public int sub(int n3, int n4) throws RemoteException{
        return n3 - n4;
    }
    public static void main (String args[]) throws RemoteException{
        try{
            Registry reg = LocateRegistry.createRegistry(1088);
            reg.rebind("server", new Server());
            System.out.println("Server is running");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
