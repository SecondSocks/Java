/* (Не синхронизирован) LinkedList (представляет собой цепь) используется там, где очень часто нужно добавлять или удалять
небольшое кол-вол элементов или большое в начало листа (Скорость O(1)-О(n). */
package CollectionLearn.ListCollections;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LinkedListLearn {
    public static void main(String[] args) {
        Student student1 = new Student("John Doe", 2);
        Student student2 = new Student("Jane Doe", 3);
        Student student3 = new Student("Bob", 4);
        Student student4 = new Student("Garry", 1);

        LinkedList<Student> students = new LinkedList<>();  // Chain
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        System.out.printf("LinkedList:\n%s\n", students);  // [student1 <-> student2 <-> student3 <-> student4 -> null]
        // Doubly LinkedList

        System.out.println(students.get(2));
        students.remove(2);
        System.out.println(students.get(2));
    }
}

class Student {
    private String name;
    private int course;
    private int hisID;
    private static int id;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
        hisID = ++id;
    }

    @Override
    public String toString() {
        return String.format("Student №%d: name=%s, course=%d", hisID, name, course);
    }
}
