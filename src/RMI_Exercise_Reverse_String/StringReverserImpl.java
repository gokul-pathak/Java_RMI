package RMI_Exercise_Reverse_String;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class StringReverserImpl extends UnicastRemoteObject implements StringReverser{
    public StringReverserImpl() throws RemoteException {
        super();
    }

    @Override
    public String reverseString(String input) throws RemoteException {
        return new StringBuilder(input).reverse().toString();
    }
}
