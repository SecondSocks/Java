package Multithreading.MethodJoin;

public class JoinLearning1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException{
        Thread thread1 = new Thread(new MyThread());
        JoinLearning1 thread2 = new JoinLearning1();
        thread1.start();
        thread2.start();

        thread1.join();  // Если в потоке main вызывается поток с методом join, тогда поток main будет ждать окончания
        thread2.join();  // работы внесенного потока
        System.out.println("End");
    }
}

class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}