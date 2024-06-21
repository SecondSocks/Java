package Multithreading.OptionToCreateThread;

public class MultiThreading3 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        MultiThreading3 thread1 = new MultiThreading3();
        thread1.start();

        for (int i = 1000; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
