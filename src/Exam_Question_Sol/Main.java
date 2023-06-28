package Exam_Question_Sol;

public class Main {
    public static void main(String[] args) {
        Thread apuThread = new Thread(new APU_Thread());
        Thread socThread = new Thread(new SOC());

        apuThread.start();
        try {
            apuThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        socThread.start();
    }
}
