import java.lang.*;
public class MyThread extends Thread implements Runnable{

    public void run(){
        System.out.println("The Thread is running: "+Thread.currentThread().getName());
    }
}
