package threadSheduling;

public class ThreadTestDrive {

    public static void main(String[] args) {

        Runnable threadJob = new MyRunnable();
        Thread myThread = new Thread(threadJob);

        myThread.start();

        System.out.println("Back in main");
    }
}
