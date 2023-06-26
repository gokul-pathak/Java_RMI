package Process_Builder;

public class ThreadLifeCycle {
    public static void main(String[] args) {
        // life cycle of Thread
        // thread's new state
        A1 ThreadA = new A1();
        A2 ThreadB = new A2();

        ThreadA.start();
        ThreadA.yield();
        System.out.println(ThreadA.getState());
        try{
            ThreadA.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        ThreadB.start();
        System.out.println("Main Thread End");

    }
}
