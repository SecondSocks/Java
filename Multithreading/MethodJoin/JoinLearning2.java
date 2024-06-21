package Multithreading.MethodJoin;

public class JoinLearning2 {
    public static void main(String[] args) {
        System.out.println("Thread main begins");

        Thread thread1 = new Thread(new Worker());
        System.out.println(thread1.getState());
        thread1.start();
        System.out.println(thread1.getState());
        try {
            thread1.join(4000);  // Ждет выполнение действий потока thread1 1.5 секунд, потом поток main продолжает
            // выполнять свои действия. Если поставить значение больше 2.5 секунд, то после выполнения действий потока
            // thread1, поток main сразу продолжит выполнение своих действий
        } catch (InterruptedException e) {
            System.out.println("Что-то мешает потоку");
        }
        System.out.println(thread1.getState());
        System.out.println("Thread main ends");
    }
}

class Worker implements Runnable {
    @Override
    public void run() {
        System.out.println("Work begins");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work ends");
    }
}