/*Используется в том случае, если требуется мало операций по измененнию листа, но много по чтению. Добивается потокобезопасность*/
package ConcurrentCollection;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;
import java.util.Iterator;

public class CopyOnWriteArrayListLearning {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Sasha"); list.add("Boris"); list.add("Maria"); list.add("Alina"); list.add("Georgy");
        System.out.println(list);

        Runnable runnable = () -> {
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(iterator.next());
            }
        };

        Runnable runnable1 = () -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.remove(4);
            list.add("Ivan");
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable1);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(list);
    }
}
