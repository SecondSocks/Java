package Streams;

import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.List;

public class CreateStream {
    public static void main(String[] args) {
        Student student = new Student("Larry", 20, 2, 3.89);
        Student student1 = new Student("Garry", 20, 2, 4.2);
        Student student2 = new Student("Marry", 22, 4, 4.61);
        Student student3 = new Student("Arthur", 19, 1, 3.33);
        Student student4 = new Student("Josh", 21, 3, 2.89);

        Stream<Student> myStream = Stream.of(student, student1, student2, student3, student4);
        List<Student> list = myStream
                .filter(element -> element.getAge() > 20 && element.getAvgGrade() > 3.0)
                .collect(Collectors.toList());
    }
}
