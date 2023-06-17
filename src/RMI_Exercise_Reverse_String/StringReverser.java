package RMI_Exercise_Reverse_String;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StringReverser extends Remote {
    String reverseString(String input) throws RemoteException;
}
