package RMI_Exercise;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class PrimeCheckerClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1088);
            PrimeChecker primeChecker = (PrimeChecker) registry.lookup("PrimeChecker");

            int number = 17; // Change this to the number you want to check
            boolean isPrime = primeChecker.isPrime(number);

            System.out.println(number + " is " + (isPrime ? "prime" : "not prime"));
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
