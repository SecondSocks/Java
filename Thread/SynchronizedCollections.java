/*Для работы с многопоточностью класс Collections предоставляет раппары (обертки). Synchronized Collections достигают
* потокобезопасности благодаря тому, что используют lock через synchronized блоки для всех методов. Т.е., если несколько
* потоков захотят добавить в нашу коллекцию элементы, то в коллекцию будет доступ по одному потоку. Сначала один поток
* выполнит свои действия, потом другой. Из-за постоянных lock скорость уменьшается*/
package Thread;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class SynchronizedCollections {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> source = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            source.add(i);
        }

        ArrayList<Integer> target = new ArrayList<>();

        Runnable runnable = () -> {target.addAll(source);};

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread1.join();  // Обязательно нужно добавить Exception
        thread2.join();
        System.out.println(target);
        /*В этом примере используется несинхронизированный ArrayList, из-за чего результат нельзя предугадать*/

        test();
    }

    private static void test() throws InterruptedException {
        ArrayList<Integer> source = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            source.add(i);
        }

        List<Integer> synchroList = Collections.synchronizedList(new ArrayList<>());  // Обернутый ArrayList
        Runnable runnable = () -> {synchroList.addAll(source);};

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(synchroList);
        /*В данном случае верный результат всегда будет гарантирован. Из-за того, что ArrayList обернут, ставится lock,
        * который не дает второму потоку начать действовать, пока первый не закончит работу*/
    }
}
