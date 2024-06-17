package Streams;

import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {
        List<String> list = List.of("Привет", "Как дела?", "ОК", "Пока");

        /*for (int i = 0; i < list.size(); i++) {
        *   list.set(i, String.valueOf(list.get(i).length()))
        * */

        List<Integer> list2 =  list.stream().map(element -> element.length()).collect(Collectors.toList());
        // Мы из коллекции получили stream - поток. Метод Map() берет по очереди из нашего стрима элементы и сопоставляет
        // им элементы, которые получаются после выполнения действий, указанных в лямбда-выражении, в скобках.
        // Метод collect помогает нам преобразовать стрим (поток) обратно в лист.
        // FACT: стримы не меняют исходные коллекции или массивы

        int[] array = {5, 9, 3, 8, 1};
        int[] array2 = Arrays.stream(array).map(element
                -> {
            if (element % 2 == 0) { element = element * element; }
            else { element = element * element * element; }
            return element;
        }).toArray();

        System.out.printf("Массив до: %s\n", Arrays.toString(array));
        System.out.printf("Массив после: %s\n", Arrays.toString(array2));

        Set<String> set = new TreeSet<>();
        set.addAll(list);

        System.out.println(set);
        Set<Integer> newSet = set.stream().map(el -> el.length()).collect(Collectors.toSet());
        List<Integer> newList = set.stream().map(el -> el.length()).collect(Collectors.toList());
        System.out.println(newSet);
        System.out.println(newList);
    }
}
