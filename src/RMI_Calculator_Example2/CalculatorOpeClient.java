package RMI_Calculator_Example2;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorOpeClient {
    public static void main(String[] args) {
        try{
            //get the registry reference
            Registry registry = LocateRegistry.getRegistry("localhost", 8080);

            //lookup the calcutoroperation object
            CalculatorOperation calculatorOperation = (CalculatorOperation) registry.lookup("Calculator");

            //perform Calculations
            int a = 5;
            int b = 6;
            int sum = calculatorOperation.add(a,b);
            int subtract = calculatorOperation.subtract(a,b);
            int divide = calculatorOperation.divide(a,b);
            int multiply = calculatorOperation.multiply(a,b);
            System.out.println("Sum is: "+sum);
            System.out.println("Subtraction is "+ subtract);
            System.out.println("Division is "+ divide);
            System.out.println("Multiplication is "+ multiply);
         }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
