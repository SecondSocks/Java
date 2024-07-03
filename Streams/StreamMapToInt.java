package Streams;

import java.util.stream.Collectors;
import java.util.List;

public class StreamMapToInt {
    public static void main(String[] args) {
        List<Student> list = Student.getStudentsList();
        List<Integer> courseNumbers = list.stream()
                                          .mapToInt(el -> el.getCourse())
                                          .boxed()
                                          .collect(Collectors.toList());
        /*В данном коде мы превращаем поток Student в поток int, состоящий из элементов = курсам элементов Student. Но
         * просто так записать этот результат ввиде List<Integer> не получится, так как надо запаковать int -> Integer
         * при помощи метода boxed(). В конце мы собираем поток в лист*/
        List<Double> avgGrades = list.stream()
                                     .mapToDouble(elem -> elem.getAvgGrade())
                                     .boxed()
                                     .collect(Collectors.toList());
        /*В данном коде мы превращаем поток Student в поток double, состоящий из элементов = avgGrade элементов Student.
        * Мы запаковываем double -> Double и собираем поток в лист*/
        int sum = list.stream().mapToInt(el -> el.getCourse()).sum();  // Сумма всех курсов
        double avg = list.stream().mapToDouble(el -> el.getAvgGrade()).average().getAsDouble();  // Среднее всех оценок
        int minAge = list.stream().mapToInt(el -> el.getAge()).min().getAsInt();  // Минимальное из всех возрастов
        int maxAge = list.stream().mapToInt(el -> el.getAge()).max().getAsInt();  // Максимальное из всех возрастов

        // Выводы
        System.out.printf("Students list: %s\n", list.toString());
        System.out.printf("Course numbers list: %s\n", courseNumbers.toString());
        System.out.printf("Avg. Grades list: %s\n", avgGrades.toString());
        System.out.printf("Sum of all courses: %d\n", sum);
        System.out.printf("Avg. grades of all marks: %.2f\n", avg);
        System.out.printf("Minimal age: %d\n", minAge);
        System.out.printf("Maximal age: %d\n", maxAge);
    }
}
