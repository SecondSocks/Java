package Streams;

import java.util.List;

public class StreamSkip {
    public static void main(String[] args) {
        List<Student> list = Student.getStudentsList();
        Student student5 = new Student("Masha", 20, 2, 3.7);
        Student student6 = new Student("Alina", 19, 1, 4.2);
        Student student7 = new Student("Gena", 23, 4, 4.3);
        Student student8 = new Student("Jane", 23, 4, 4.8);
        Student student9 = new Student("Liza", 21, 2, 3.5);
        list.add(student5);
        list.add(student6);
        list.add(student7);
        list.add(student8);
        list.add(student9);

        list.stream().filter(elem -> elem.getAge() > 20).forEach(System.out::println);
        // Выводит все элементы, которые соответствуют условию
        System.out.println("--------------------------------------------------------");
        list.stream().filter(elem -> elem.getAge() > 20).limit(2).forEach(System.out::println);
        // Выводит только первые 2 элемента, которые соответствуют условию
        System.out.println("--------------------------------------------------------");
        list.stream().filter(elem -> elem.getAge() > 20).skip(2).forEach(System.out::println);
        // Пропускает первые 2 элемента, которые соответствуют условию

    }
}
