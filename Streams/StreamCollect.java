package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class StreamCollect {
    public static void main(String[] args) {
        groupingBy();
        partitioningBy();
    }

    private static void groupingBy() {
        List<Student> students = Student.getStudentsList();
        Map<Integer, List<Student>> map = students.stream()
                .map(elem -> {
                    elem.setName(elem.getName().toUpperCase());
                    return elem;
                })
                .collect(Collectors.groupingBy(el -> el.getCourse()));
        /*Сначала мы имя каждого элемента ставим в верхний регистр. Затем методом collect() мы группируеи элементы по курсу.
         * На выходе мы получаем Map<Integer, List<Student>>*/

        for (Map.Entry<Integer, List<Student>> entry : map.entrySet()) {
            System.out.printf("%d : %s\n", entry.getKey(), entry.getValue().toString());
        }
    }

    private static void partitioningBy() {
        List<Student> students = Student.getStudentsList();
        Map<Boolean, List<Student>> map = students.stream()
                .collect(Collectors.partitioningBy(elem -> elem.getAvgGrade() > 4.0));
        /*В данном случае в методе collect() происходит разбиение на 2 листа по среднему баллу. На выходе получаем
         * Map<Boolean, List<Student>>*/

        for (Map.Entry<Boolean, List<Student>> entry : map.entrySet()) {
            if (entry.getKey()) {
                System.out.printf("Students with mark > 4: %s\n", entry.getValue().toString());
            } else {
                System.out.printf("Students with mark < 4: %s\n", entry.getValue().toString());
            }
        }
    }
}
