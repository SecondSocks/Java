package Thread;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class SynchronizedCollections1 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1001; i++) {
            arrayList.add(i);
        }

        List<Integer> synchList = Collections.synchronizedList(arrayList);

        Runnable runnable1 = () -> {
            synchronized (synchList) {  // Этот ручной lock
                Iterator<Integer> iterator = synchList.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
            }
        };
        Runnable runnable2 = () -> {
            int count = 0;
            for (int i = 0; i < 918; i++) {
                if (count == 10) {
                    count = 0;
                    synchList.remove(i);
                } else {
                    count++;
                }
            }
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(synchList);
        /*Если использовать обычный arrayList, выброситься ошибка, потому что один поток пытается вывести элементы на экран,
         * а второй удалить. Но и при использовании обернутого List может выбрасываться исключение*/
    }
}
