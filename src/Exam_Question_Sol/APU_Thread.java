package Exam_Question_Sol;

public class APU_Thread implements Runnable {

    @Override
    public void run() {
        System.out.println("Testing APU thread");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("End of APU thread");
    }
}
