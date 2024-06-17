package CollectionLearn;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorLearn {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A"); list.add("B"); list.add("C");

        Iterator<String> iterator = list.iterator();
        // Output
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Remove
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(list);
    }
}
