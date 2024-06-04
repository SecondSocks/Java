/*(Синхронизирован) Vector предназначен для работы с несколькими потоками. Он позволяет нескольким пользователям
* добавлять и удалять данные из листа, блокируя одно из них до завершения операции первого, поэтому он медленее, чем
* ArrayList/LinkedList. Не рекомендуется использовать*/
package CollectionLearn.ListCollections;

import java.util.Vector;

public class VectorLearn {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Anton");
        vector.add("Andrew");
        vector.add("Bob");
        vector.add("Charlie");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());

        vector.remove(2);
        System.out.println(vector);
        System.out.println(vector.get(1));
    }
}
