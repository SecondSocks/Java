package Streams;

import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public class StreamFilter {
    public static void main(String[] args) {
        Student student = new Student("Larry", 20, 2, 3.89);
        Student student1 = new Student("Garry", 20, 2, 4.2);
        Student student2 = new Student("Marry", 22, 4, 4.61);
        Student student3 = new Student("Arthur", 19, 1, 3.33);
        Student student4 = new Student("Josh", 21, 3, 2.89);
        List<Student> list = new ArrayList<>();
        list.add(student); list.add(student1); list.add(student2); list.add(student3); list.add(student4);

        List<Student> filteredList = list.stream()
                .filter(element -> element.getAge() > 20 && element.getAvgGrade() > 4.0)
                .collect(Collectors.toList());
        System.out.println(filteredList);
    }
}
