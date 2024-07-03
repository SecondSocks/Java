package Streams;

import java.util.List;

public class StreamLimit {
    public static void main(String[] args) {
        List<Student> list = Student.getStudentsList();
        list.stream().filter(elem -> elem.getAge() > 20).limit(2).forEach(System.out::println);
        /*limit() ограничивает число элементов в потоке*/
    }
}
