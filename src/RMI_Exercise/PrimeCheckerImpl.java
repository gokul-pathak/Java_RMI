package RMI_Exercise;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class PrimeCheckerImpl extends UnicastRemoteObject implements PrimeChecker {
    protected PrimeCheckerImpl() throws RemoteException {
        super();
    }

    public boolean isPrime(int number) throws RemoteException {
        if (number <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }

        return true;
    }
}
