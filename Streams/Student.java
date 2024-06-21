package Streams;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private final String name;
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
