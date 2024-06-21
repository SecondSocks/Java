package Multithreading.OptionToCreateThread;

public class MultiThreading2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new thread());
        Thread thread1 = new Thread(new thread1());
        thread.start();
        thread1.start();
    }
}

class thread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}

class thread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 1000; i >= 1; i--) {
            System.out.println(i);
        }
    }
}