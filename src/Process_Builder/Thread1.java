package Process_Builder;

public class Thread1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello from thread 1");
        for(int i=1; i<10; i++)
        {
            System.out.println("i: "+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }

    }

}
