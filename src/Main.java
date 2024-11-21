//multithreading

public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();// Create a MyThread object
        MyThread thread2 = new MyThread();//Create a MyThread object
        MyThread thread3 = new MyThread();
        Thread thread = new Thread(thread1); // Pass the MyThread object to the Thread constructor
        Thread thread4 = new Thread(thread2);//
        Thread thread5 = new Thread(thread3);//
        thread.start();  // Start the thread, which calls the run() method
        thread4.start();
        thread5.start();
        while(thread5.isAlive()){
           System.out.println("It is running:"+Thread.currentThread().getName());
        }
    }
}
