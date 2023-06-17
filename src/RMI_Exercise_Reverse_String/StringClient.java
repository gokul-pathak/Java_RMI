package RMI_Exercise_Reverse_String;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class StringClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1088);
            StringReverser reverser = (StringReverser) registry.lookup("StringReverser");

            String input = "Hello, World!";
            String reversed = reverser.reverseString(input);
            System.out.println("Original: " + input);
            System.out.println("Reversed: " + reversed);
        } catch (Exception e) {
            System.err.println("RMI client exception: " + e);
            e.printStackTrace();
        }
    }
}
