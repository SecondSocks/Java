package Streams;

import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class MethodChaining {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.toIntExact(Math.round(Math.random() * 100));
        }

        int result = Arrays.stream(array)
                .filter(elem -> elem % 2 == 1)
                .map(elem -> {
                    if (elem % 3 == 0) elem /= 3;
                    return elem;
                })
                .reduce((accum, elem) -> accum+elem)
                .getAsInt();
        /*Сначала мы передаем массив в поток. Затем мы фильтруем его по признаку нечетности числа. Затем, если элемент
        * делится на 3, то мы меняем его на результат этого деления. Затем мы все суммируем и переводим в Int*/
        System.out.printf("Array: %s\n", Arrays.toString(array));
        System.out.printf("Formating sum result: %d\n", result);

        test();
    }

    public static void test() {
        Student student = new Student("Larry", 20, 2, 3.89);
        Student student1 = new Student("Garry", 20, 2, 4.2);
        Student student2 = new Student("Marry", 22, 4, 4.61);
        Student student3 = new Student("Arthur", 19, 1, 3.33);
        Student student4 = new Student("Josh", 21, 3, 2.89);
        Student student5 = new Student("Masha", 20, 2, 3.7);
        Student student6 = new Student("Alina", 19, 1, 4.2);
        Student student7 = new Student("Gena", 23, 4, 4.3);
        Student student8 = new Student("Jane", 23, 4, 4.8);
        Student student9 = new Student("Liza", 21, 2, 3.5);
        List<Student> list = new ArrayList<>();
        list.add(student); list.add(student1); list.add(student2); list.add(student3); list.add(student4);
        list.add(student5); list.add(student6); list.add(student7); list.add(student8); list.add(student9);

        System.out.printf("List before: %s\n", list);

        list.stream()                                               // Source method
                .map(elem -> {                                      // Lazy Method
                    elem.setName(elem.getName().toUpperCase());     // Lazy Method
                    return elem;
                })                                                  // Lazy Method
                .filter(elem -> elem.getAge() > 20)                 // Lazy Method
                .sorted((st1, st2) -> st1.getCourse() - st2.getCourse())  // Lazy Method
                .forEach(System.out::println);                      // Terminal (Eager) Method
    }

    public static void test1() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        int result = stream.filter(el -> {
            System.out.println("Do");
            return el % 2 == 0;
        }).reduce(1, (accum, elem) -> accum + elem);
    }
}
