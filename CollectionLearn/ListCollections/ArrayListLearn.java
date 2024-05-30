package CollectionLearn.ListCollections;

import java.util.ArrayList;
import java.util.List;

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

        test(list);
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
        System.out.println(list.toString());
    }
}
