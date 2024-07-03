package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private final int course;
    private final int age;
    private final double avgGrade;

    public Student(String name, int age, int course, double avgGrade) {
        this.name = name;
        this.course = course;
        this.age = age;
        this.avgGrade = avgGrade;
    }

    public String getName() { return name; }
    public int getCourse() { return course; }
    public int getAge() { return age; }
    public double getAvgGrade() { return avgGrade; }

    public void setName(String name) { this.name = name; }

    public static List<Student> getStudentsList() {
        List<Student> list = new ArrayList<>();

        Student student = new Student("Larry", 20, 2, 3.89);
        Student student1 = new Student("Garry", 20, 2, 4.2);
        Student student2 = new Student("Marry", 22, 4, 4.61);
        Student student3 = new Student("Arthur", 19, 1, 3.33);
        Student student4 = new Student("Josh", 21, 3, 2.89);

        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);

        return list;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d, Course: %d, Avg. Grade: %.2f", name, age, course, avgGrade);
    }

    @Override
    public boolean equals(Object anotherStudent) {
        if (this == anotherStudent) return true;
        if (anotherStudent == null || getClass() != anotherStudent.getClass()) return false;
        Student student = (Student) anotherStudent;
        return name.equals(student.name) && course == student.course && age == student.age && avgGrade == student.avgGrade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    @Override
    public int compareTo(Student anotherStudent) {
        return this.course-anotherStudent.course;
    }
    /*ВАЖНО!!! equals()=true => compareTo()=0
    * Если compareTo() сортирует по курсу => hashCode должен использовать только курс*/
}
