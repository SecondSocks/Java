/*(Не синхронизирован) В основе TreeMap лежит красно-черное дерево, что позволяет методам работать быстро, но не
* быстрее HashMap*/
package CollectionLearn.MapCollections;

import java.util.TreeMap;
import java.util.Comparator;

public class TreeMapLearning {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();

        Student student = new Student("John", 2);
        Student student2 = new Student("Jane", 3);
        Student student3 = new Student("Jack", 4);
        Student student4 = new Student("Jill", 1);
        Student student5 = new Student("Josh", 2);
        Student student6 = new Student("Fill", 3);
        Student student7 = new Student("Mary", 1);
        Student student8 = new Student("Jill", 1);

        treeMap.put(4.2, student);
        treeMap.put(4.8, student2);
        treeMap.put(3.9, student3);
        treeMap.put(3.6, student4);
        treeMap.put(4.5, student5);
        treeMap.put(3.4, student6);
        treeMap.put(3.0, student7);
        System.out.println(treeMap);  // Данные выводятся по возрастанию
        treeMap.put(3.3, student8);
        System.out.println(treeMap);  // Значения могут быть неуникальными, а ключи обязаны! быть разными

        System.out.println(treeMap.get(4.5));
        treeMap.remove(3.3);
        System.out.println(treeMap);
        System.out.printf("Дерево до:\n%s\n", treeMap);
        System.out.printf("Дерево после:\n%s\n", treeMap.descendingMap());

        System.out.println("Бал для прохождения = 4.0. Прошли следующие:");
        System.out.println(treeMap.tailMap(4.0));  // >= 4.0
        System.out.printf("Не прошли:\n%s\n", treeMap.headMap(4.0));  // <= 4.0

        System.out.printf("Последнее, высшее значение в списке: %s\n", treeMap.lastEntry());
        System.out.printf("Первое, низшее значение в списке: %s\n", treeMap.firstEntry());

        System.out.printf("Наивысший бал: %s\n", treeMap.lastKey());
        System.out.printf("Низший бал: %s\n", treeMap.firstKey());

        /*Если мы захотим в виде ключа использовать Student, то он должен наследовать интерфейс Comparable */
        TreeMap<Student, Double> treeMap2 = new TreeMap<>(new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });  // Анонимный класс

        treeMap2.put(student, 4.21);
        treeMap2.put(student2, 3.22);
        treeMap2.put(student3, 4.38);
        treeMap2.put(student4, 3.63);
        treeMap2.put(student5, 4.55);
        treeMap2.put(student6, 4.93);
        treeMap2.put(student7, 3.02);
        System.out.println(treeMap2);

        System.out.println(treeMap2.containsKey(student8));
    }
}
