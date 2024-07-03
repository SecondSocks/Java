package Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamFlatMap {
    public static void main(String[] args) {
        Student student = new Student("Larry", 20, 2, 3.89);
        Student student1 = new Student("Garry", 20, 2, 4.2);
        Student student2 = new Student("Marry", 22, 4, 4.61);
        Student student3 = new Student("Arthur", 19, 1, 3.33);
        Student student4 = new Student("Josh", 21, 3, 2.89);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied mathematics");
        f1.addStudenToFaculty(student);
        f1.addStudenToFaculty(student1);
        f1.addStudenToFaculty(student2);
        f2.addStudenToFaculty(student3);
        f2.addStudenToFaculty(student4);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1); facultyList.add(f2);
        facultyList.stream()
                .flatMap(faculty -> faculty.getStudentsOnFaculty().stream())
                .forEach(el -> System.out.println(el.getName()));
        /*Если требуется достать элеметы листа из листа, переданного в поток, используется метод flatMap(a -> a.stream())*/
    }
}

class Faculty {
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() { return studentsOnFaculty; }

    public void addStudenToFaculty(Student student) { studentsOnFaculty.add(student); }
}