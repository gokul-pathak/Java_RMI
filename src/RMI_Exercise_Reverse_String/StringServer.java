package RMI_Exercise_Reverse_String;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class StringServer {
    public static void main(String[] args) {
        try {
            StringReverser reverser = new StringReverserImpl();
            Registry registry = LocateRegistry.createRegistry(1088);
            registry.rebind("StringReverser", reverser);
            System.out.println("RMI server is running.");
        } catch (Exception e) {
            System.err.println("RMI server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
