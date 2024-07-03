package Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamFindFirst {
    public static void main(String[] args) {
        List<Student> list = Student.getStudentsList();

        Student first = list.stream()
                .map(elem -> {
            elem.setName(elem.getName().toUpperCase());
            return elem; })
                .filter(elem -> elem.getAge() > 20)
                .sorted((st1, st2) -> st1.getCourse() - st2.getCourse())
                .findFirst().get();
        /*Метод findFirst() выводит самого первого студента в потоке, который прошел все lazy методы*/
        System.out.println(first);
    }
}
