package Exam_Question_Sol;

public class SOC extends APU_Thread {

    @Override
    public void run() {
        System.out.println("Testing SOC thread");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("End of SOC thread");
    }
}
