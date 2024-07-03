/*(Не синхронизирован) ArrayList (содержит в себе массив) используется там, где очень часто нужно получать элемент,
добавлять или удалять большое кол-во в середине или конце листа (Скорость = О(1). Формула: byte + x * byte(type))
* Он работает очень быстро, чаще всего стоит использовать его*/
package CollectionLearn.ListCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ArrayListLearn {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();  // Колекции можно создавать 2-мя разными способами
        // List -> ArrayList
        ArrayList<Integer> list2 = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            list2.add(i);
        }
        ArrayList<Integer> list3 = new ArrayList<>(list2);  // list2 был скопирован в list3

        //test(list);
        methods4();
    }

    private static void test(ArrayList<String> list) {
        // Методы ArrayList
        // add(obj);
        list.add("Fussily");
        list.add("Corns");
        System.out.println(list);

        // add(index, obj);
        int index = 0;
        list.add(index, "Feathers");
        System.out.println(list);
        // get(index)
        System.out.println(list.get(index));

        // set(index, obj) == replace
        try {
            list.set(index, list.get(index + 1));
        } catch (Exception e) {
            System.out.println("Oops, errors");
        }
        System.out.println(list);

        // remove(obj)
        list.remove("Fussily");  // Удаляется первое вхождение
        System.out.println(list);

        // remove(index)
        list.remove(0);
        System.out.println(list);

        // addAll(ArrayList)
        List<String> list1 = new ArrayList<>();
        list1.add("Brown");
        list1.add("Green");
        list1.add("Blue");
        list.addAll(list1);
        System.out.println(list);

        // addAll(index, ArrayList)
        list.addAll(0, list1);
        System.out.println(list);

        // clear()
        List<String> copyList = new ArrayList<>(list);
        list.clear();
        System.out.println(list);

        // indexOf(Obj)
        System.out.println(list.indexOf("Brown"));
        list.addAll(copyList);
        System.out.println(list.indexOf("Brown"));

        // lastIndexOf(Obj)
        list.add("Brown");
        System.out.println(list.lastIndexOf("Brown"));

        // contains(Obj)
        System.out.println(list.contains("Blue"));
        System.out.println(list.contains("Red"));

        // toString()
        System.out.println(list);

        // toArray()
        Object[] array = list.toArray();
        for (Object object : array) {
            System.out.println(object);
        }
    }

    private static void methods() {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        StringBuilder[] arraySB = {sb1, sb2, sb3, sb4};

        List<StringBuilder> list = Arrays.asList(arraySB);
        System.out.println(list);  // [A, B, C, D]

        sb1.append(" Update");
        System.out.println(list); // [A Update, B, C, D]
    }

    private static void methods1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A"); list.add("B"); list.add("C");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("C"); list1.add("D");

        list.removeAll(list1);
        System.out.println(list);
    }

    private static void methods2() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A"); list.add("B"); list.add("C");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("C"); list1.add("D");

        System.out.println(list.containsAll(list1));

        list.retainAll(list1);
        System.out.println(list);
    }

    private static void methods3() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A"); list.add("B"); list.add("C");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("C"); list1.add("D");

        list.addAll(list1);
        List<String> sub = list.subList(0, 2);

        Object[] array = list.toArray();
        for (Object obj : array) {
            System.out.printf("%s ", obj);
        }
    }

    private static void methods4() {
        List<Integer> list = List.of(3, 90, 50, 10);
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A"); list2.add("B"); list2.add("C");

        List<String> list1 = List.copyOf(list2);
        System.out.println(list1);
    }
}
