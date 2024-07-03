package Multithreading.MethodsWaitAndNotify;

public class Test {
    public static void main(String[] args) {
        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}

class Store {
    private int product = 0;

    public synchronized void get() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Поток был прерван");
        }

        while (product < 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Поток был прерван");
            }
        }
        product--;
        System.out.println("Покупатель купил 1 товар");
        System.out.printf("Товаров на складе: %d\n", product);
        notify();
    }

    public synchronized void put() {
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            System.out.println("Поток был прерван");
        }

        while (product > 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Поток был прерван");
            }
        }
        product++;
        System.out.println("Производитель добавил 1 товар");
        System.out.printf("Товаров на складе: %d\n", product);
        notify();
    }
}

class Producer implements Runnable {
    Store store;

    Producer(Store store) {
        this.store = store;
    }

    public void run() {
        for (int i = 0; i < 6; i++) {
            store.put();
        }
    }
}

class Consumer implements Runnable {
    Store store;

    Consumer(Store store) {
        this.store = store;
    }

    public void run() {
        for (int i = 0; i < 6; i++) {
            store.get();
        }
    }
}