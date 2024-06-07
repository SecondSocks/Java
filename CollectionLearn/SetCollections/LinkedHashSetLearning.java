/*(Не синхронизирован) LinkedHashSet - наследник HashSet - хранит информацию о порядке добавления элементов.
* Скорость ниже, чем у HashSet. В основе лежит HashMap: keys = LinkedHashSet.value; values = const*/
package CollectionLearn.SetCollections;

import java.util.LinkedHashSet;

public class LinkedHashSetLearning {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        for (int i = 0; i < 10; i++) {
            linkedHashSet.add(Math.toIntExact(Math.round(Math.random() * 10)));
        }
        System.out.println(linkedHashSet);  // В какой последовательности были добавлены, в такой и остались.
        // Повторяющиеся элементы не добавляются

        boolean isContains = linkedHashSet.contains(3);
        if (isContains) {
            linkedHashSet.remove(3);
            System.out.println("Была удалена 3");
        }
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.isEmpty());
    }
}
