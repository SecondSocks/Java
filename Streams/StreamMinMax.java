package Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamMinMax {
    public static void main(String[] args) {
        min();
        max();
    }

    private static void min() {
        List<Student> students = Student.getStudentsList();
        Student minStudent = students.stream().min((st1, st2) -> st1.getAge() - st2.getAge()).get();
        System.out.printf("Younger student: %s\n", minStudent);
    }

    private static void max() {
        List<Student> students = Student.getStudentsList();
        Student maxStudent = students.stream().max((st1, st2) -> st1.getAge() - st2.getAge()).get();
        System.out.printf("Elder student: %s\n", maxStudent);
    }

}
