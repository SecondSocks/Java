package Multithreading.OptionToCreateThread;

public class MultiThreading5 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        }).start();
        new Thread(() -> System.out.println("Bye")).start();
    }
}
