package Calculator_Example_API;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        Client c = new Client();
        c.connectServer();
    }
    private void connectServer(){
        try {
            Registry reg = LocateRegistry.getRegistry("localhost", 1088);
            Adder a = (Adder) reg.lookup("server");
            System.out.println("Addition is: "+a.add(10,20));

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
