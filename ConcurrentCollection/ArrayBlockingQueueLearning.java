package ConcurrentCollection;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueLearning {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);

        // Producer
        new Thread(() -> {
            int i = 0;
            while (true) {
                try {
                    queue.put(++i);
                    System.out.printf("Producer add number %d. Queue now: %s\n", i, queue);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Producer can't add number");
                }
            }
        }).start();

        // Consumer
        new Thread(() -> {
            while (true) {
                try {
                    int j = queue.take();
                    System.out.printf("Consumer take number %d. Queue now: %s\n", j, queue);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println("Consumer can't take number ");
                }
            }
        }).start();
    }
}
