package RMI_Calculator_Example2;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorOpServer {
    public static void main(String[] args) {
        try{
            CalculatorOperation calculatorOperation = new CalculatorOpeImplement();
            //Start the RMI registry at port 1099
            Registry registry = LocateRegistry.createRegistry(8080);

            //Bind the calculator object to the registry
            registry.rebind("Calculator", calculatorOperation);
            System.out.println("k xa k");
            System.out.println("Calculator Server is running....");
        }
        catch (RemoteException e){
            e.printStackTrace();
        }
    }
}
