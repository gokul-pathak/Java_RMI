package Process_Builder;

import java.io.IOException;

public class NotepadProcessBuilder {
    public static void main(String[] args) {
        ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe");

        try{
            //start the process
            Process process  = processBuilder.start();

            //wait for the process to terminate
            while(true){
                try{
                    int exitCode = process.exitValue();
                    System.out.println("process exited with code: " + exitCode);
                    break;
                } catch(IllegalThreadStateException e){
                    //process is still running
                }
                Thread.sleep(1000); //wait for 1 second before checking agin
            }
        }catch(IOException e){
            System.out.println("error creating process: " + e.getMessage());
        }catch(InterruptedException e){
            System.out.println("error waiting for process: " + e.getMessage());
        }
    }
}