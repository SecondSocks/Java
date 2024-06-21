package Multithreading.OptionToCreateThread;

public class MultiThreading1 {
    public static void main(String[] args) {
         MyThread myThread = new MyThread();
         MyThread1 myThread1 = new MyThread1();
         myThread.start();
         myThread1.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 1000; i >= 1; i--) {
            System.out.println(i);
        }
    }
}