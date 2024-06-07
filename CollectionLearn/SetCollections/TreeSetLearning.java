/*(Не синхронизирован) TreeSet - хранит отсортированные по возрастанию элементы. В основе лежит TreeMap: keys = TreeSet;
* values = const*/
package CollectionLearn.SetCollections;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.Set;

public class TreeSetLearning {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            treeSet.add(Math.toIntExact(Math.round(Math.random() * 10)));
        }
        System.out.println(treeSet);  // Не добавляет дубликатов, хранит в отсортированном порядке
        boolean isContains = treeSet.contains(3);
        if (isContains) {
            treeSet.remove(3);
            System.out.println("Удалена цифра 3");
        }
        System.out.println(treeSet);
        System.out.println();

        test();
    }

    private static void test() {
        TreeSet<Student> treeSet = new TreeSet<>();

        Student student1 = new Student("Frank", 2);
        Student student2 = new Student("Larry", 1);
        Student student3 = new Student("Garry", 3);
        Student student4 = new Student("Hank", 4);

        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student4);

        System.out.println(treeSet);

        System.out.println(treeSet.first());
        System.out.println(treeSet.last());

        Student student5 = new Student("Ivan", 3);
        System.out.println(treeSet.headSet(student5));  // Выведутся все элементы, у которых курс < student5.course
        System.out.println(treeSet.tailSet(student5));  // Выведутся все элементы, у которых курс > student5.course

        Student student6 = new Student("Will", 1);
        Student student7 = new Student("Bob", 4);
        System.out.println(treeSet.subSet(student6, student7));  // Выведутся все элементы входящие в
        // student6.course < subSet < student7.course
    }
}
