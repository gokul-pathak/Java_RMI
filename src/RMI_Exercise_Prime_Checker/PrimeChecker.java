package RMI_Exercise_Prime_Checker;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PrimeChecker extends Remote {
    boolean isPrime(int number) throws RemoteException;
}
