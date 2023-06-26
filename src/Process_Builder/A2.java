package Process_Builder;

public class A2 extends Thread
{
    public void run(){
        System.out.println("Thread B");
        System.out.println(" i in Thread B");
        for(int i=1; i<=5; i++){
            System.out.println("i = " + i);
        }
        System.out.println("Thread B completed.");
    }
}
