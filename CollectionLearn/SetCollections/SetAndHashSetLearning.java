/*(Не синхронизирован) Set - урезанная версия Map, т.к не требуется значение, а вводится лишь значение. В себе несет Map
* (Не синхронизирован) HashSet - урезанная версия HashMap, как и у Set, значение не требуется, в себе несет HashMap.
* Вместо значения они подставляют константы. HashSet не запоминает порядок добавления элементов*/
package CollectionLearn.SetCollections;

import java.util.Set;
import java.util.HashSet;

public class SetAndHashSetLearning {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("John");
        set.add("Jane");
        set.add("Jack");
        set.add("Josh");

        System.out.println(set);

        for (String s : set) {
            System.out.printf("%s, ", s);
        }
        System.out.println();

        set.add("Jane");
        System.out.println(set);  // Set не может содержать дубликаты

        set.remove("John");
        System.out.println(set);
        System.out.println(set.size());

        for (String s : set) {
            set.remove(s);
        }
        System.out.println(set.isEmpty());

        set.add("John");
        set.add("Jane");
        set.add("Jack");
        set.add("Josh");

        System.out.println(set.contains("John"));
    }
}
