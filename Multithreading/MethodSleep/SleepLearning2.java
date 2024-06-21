package Multithreading.MethodSleep;

public class SleepLearning2 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("%s %d\n", Thread.currentThread().getName(), i);
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable());
        SleepLearning2 thread2 = new SleepLearning2();
        thread1.start();
        thread2.start();
        System.out.println("End");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("%s %d\n", Thread.currentThread().getName(), i);
        }
    }
}