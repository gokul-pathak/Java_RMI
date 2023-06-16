package RMI_Exercise;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class PrimeCheckerServer {
    public static void main(String[] args) {
        try {
            PrimeCheckerImpl primeChecker = new PrimeCheckerImpl();
            Registry registry = LocateRegistry.createRegistry(1088);
            registry.rebind("PrimeChecker", primeChecker);
            System.out.println("Server is running...");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
