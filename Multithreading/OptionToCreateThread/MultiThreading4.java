package Multithreading.OptionToCreateThread;

public class MultiThreading4 implements Runnable {
    @Override
    public void run() {
        for (int i = 1000; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MultiThreading4());
        thread.start();

        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}
