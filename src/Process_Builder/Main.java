package Process_Builder;

public class Main {
    public static void main(String[] args) {
        Thread1 t1= new Thread1();
        //to start thread t1. start() cannot be done
        // java.lang.thread
        Thread t = new Thread(t1);
        t.start();
        Thread2 t2 = new Thread2();
        t2.start();

    }
}
