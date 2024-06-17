package learning1;

import java.util.ArrayList;

public class UniversalParameters1 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Math.toIntExact(Math.round(Math.random() * 100)));
        }
        printer.printList(list);

        String[] peoples = {"Bobby", "Garry", "Franklin", "John"};
        Integer[] datas = {50, 10, 20, 30, 450};
        printer.<String>printArray(peoples);
        printer.<Integer>printArray(datas);
    }
}

class Printer {
    public <Type> void printList(ArrayList<Type> list) {
        for (Type element : list) {
            System.out.println(element);
        }
    }

    public <Type> void printArray(Type[] array) {
        for (Type element : array) {
            System.out.println(element);
        }
    }
}
/*Особенность обобщенного метода - указание универсального параметра в объявлении метода после всех модификаторов*/