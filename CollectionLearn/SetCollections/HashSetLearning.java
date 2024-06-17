package CollectionLearn.SetCollections;

import java.util.HashSet;

public class HashSetLearning {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            hashSet.add(Math.toIntExact(Math.round(Math.random() * 10)));
        }

        HashSet<Integer> hashSet1 = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            hashSet1.add(Math.toIntExact(Math.round(Math.random() * 10)));
        }

        HashSet<Integer> union = new HashSet<>(hashSet);
        System.out.println(hashSet);
        System.out.println(hashSet1);
        union.addAll(hashSet1);  // Объединяет два сета без дубликатов
        System.out.println(union);

        HashSet<Integer> intersection = new HashSet<>(hashSet);
        intersection.retainAll(hashSet1);  // Оставляет в сете только похожие элементы
        System.out.println(intersection);

        HashSet<Integer> subtract = new HashSet<>(hashSet);
        subtract.removeAll(hashSet1);  // У hashSet удаляются все похожие с hashSet1 элементы
        System.out.println(subtract);
    }
}
