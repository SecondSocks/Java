package CollectionLearn.SetCollections;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private final String name;
    private final int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() { return name; }
    public int getCourse() { return course; }

    @Override
    public String toString() {
        return String.format("Name: %s, Course: %d", name, course);
    }

    @Override
    public boolean equals(Object anotherStudent) {
        if (this == anotherStudent) return true;
        if (anotherStudent == null || getClass() != anotherStudent.getClass()) return false;
        Student student = (Student) anotherStudent;
        return name.equals(student.name) && course == student.course;
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
