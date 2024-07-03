package Lambda;

import java.util.ArrayList;
import java.util.Collections;

public class Lambda1 {
    public static void main(String[] args) {
        Student st1 = new Student("Bob", 'M', 20, 2, 4.3);
        Student st2 = new Student("Alice", 'F', 19, 1, 3.9);
        Student st3 = new Student("Garry", 'M', 22, 4, 3.6);
        Student st4 = new Student("John", 'M', 23, 5, 4.8);
        Student st5 = new Student("Jane", 'F', 20, 2, 3.3);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        Lambda1 lambda = new Lambda1();
        lambda.printStudentOverGrade(students, 3.8);
        System.out.println();
        lambda.printStudentUnderAge(students, 20);
        System.out.println();
        lambda.printStudentMixCondition(students, 19, 4.0, 'M');
        System.out.println();

        lambda.testStudents(students, new CheckOverGrade());
        System.out.println();
        lambda.testStudents(students, new StudentChecks() {
            @Override
            public boolean check(Student student) {
                return student.getAge() >= 18;
            }
        });
        System.out.println();

        lambda.testStudents(students, (Student st) -> { return st.getAge() >= 18; });  // Лямбда-выражение
        // Справа от стрелочки находится код, который являлся бы телом метода соответствующего класса, исплемен. интерф.
        System.out.println();
        lambda.testStudents(students, (Student st) -> { return st.getAvgGrade() > 3.2; });
        System.out.println();
        lambda.testStudents(students, (Student st) ->
                            { return st.getAvgGrade() > 3.8 && st.getAge() >= 20 && st.getSex() == 'M'; });
        // Весь код выше можно легко сократить
        lambda.testStudents(students, s -> s.getAvgGrade() > 3.5);
        // FACT: нельзя использовать краткий вариант написания левой части лямбда-выражения, если сигнатура интерфейса
        // принимает более 1 параметра
        lambda.testStudents(students, (Student s) -> s.getAge() > 20);
        lambda.testStudents(students, s -> { return s.getAge() > 18 && s.getAvgGrade() > 3.3 && s.getSex() == 'F'; });
        // Можно совмещать вид написания
        System.out.println();
        lambda.testStudents(students, s -> {
            System.out.println("Поиск");
            return s.getAvgGrade() > 4.0;
        });
        // Если в правой части лямбда-выражения мы пишем более 1 выражения, то нужно заключать код в скобки
        System.out.println();

        // Лямбда-выражение можно вынести
        StudentChecks sc = (Student s) -> { return s.getAvgGrade() > 4.0; };
        lambda.testStudents(students, sc);

        System.out.printf("Студенты до сортировки: %s\n", students);
        Collections.sort(students, (stud1, stud2) -> stud1.getCourse()-stud2.getCourse());
        System.out.printf("Студенты после сортировки: %s\n", students);
    }

    private void printStudentOverGrade(ArrayList<Student> students, double grade) {
        for (Student student : students) {
            if (student.getAvgGrade() > grade) {
                System.out.println(student);
            }
        }
    }

    private void printStudentUnderAge(ArrayList<Student> students, int age) {
        for (Student student : students) {
            if (student.getAge() > age) {
                System.out.println(student);
            }
        }
    }

    private void printStudentMixCondition(ArrayList<Student> students, int age, double grade, char sex) {
        for (Student student : students) {
            if (student.getAge() > age && student.getAvgGrade() < grade && student.getSex() == sex) {
                System.out.println(student);
            }
        }
    }

    private void testStudents(ArrayList<Student> students, StudentChecks studentChecks) {
        for (Student student : students) {
            if (studentChecks.check(student)) {
                System.out.println(student);
            }
        }
    }
}

interface StudentChecks {
    boolean check(Student student);
}

class CheckOverGrade implements StudentChecks {
    @Override
    public boolean check(Student student) {
        return student.getAvgGrade() > 4.0;
    }
}