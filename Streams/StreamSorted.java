package Streams;

import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamSorted {
    public static void main(String[] args) {
        int[] array = {3, 10, 2, 22, 222, 121, 21, 45, 5};
        int[] sortedArray = Arrays.stream(array).sorted().toArray();

        System.out.printf("Array before: %s\n", Arrays.toString(array));
        System.out.printf("Array after: %s\n", Arrays.toString(sortedArray));

        Student student = new Student("Larry", 20, 2, 3.89);
        Student student1 = new Student("Garry", 20, 2, 4.2);
        Student student2 = new Student("Marry", 22, 4, 4.61);
        Student student3 = new Student("Arthur", 19, 1, 3.33);
        Student student4 = new Student("Josh", 21, 3, 2.89);
        List<Student> list = new ArrayList<>();
        list.add(student); list.add(student1); list.add(student2); list.add(student3); list.add(student4);
        List<Student> sortedList = list.stream().sorted((st1, st2) ->
                st1.getName().compareTo(st2.getName())
                ).collect(Collectors.toList());

        System.out.printf("List before: %s\n", list);
        System.out.printf("List after: %s\n", sortedList);
    }
}
