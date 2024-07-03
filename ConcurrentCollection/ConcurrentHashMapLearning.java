package ConcurrentCollection;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;

public class ConcurrentHashMapLearning {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Genry"); map.put(2, "Frank"); map.put(3, "Loyd"); map.put(4, "Steve"); map.put(5, "Sally");
        System.out.println(map);

        Runnable runnable = () -> {
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int i = iterator.next();
                System.out.printf("%d : %s\n", i, map.get(i));
            }
        };

        Runnable runnable1 = () -> {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            map.put(6, "Francis");
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable1);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(map);
    }
}
