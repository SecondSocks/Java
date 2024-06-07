/*(Не синхронизирован) LinkedHashMap - хранит ссылки на соседей, как и LinkedList*/
package CollectionLearn.MapCollections;

import java.util.LinkedHashMap;

public class LinkedHashMapLearning {
    public static void main(String[] args) {
        int capacity = 16;
        float loadFactor = 0.75f;
        LinkedHashMap<Double, Student> students = new LinkedHashMap<>(capacity, loadFactor, true);
        // accessOrder = false - при использовании элемента порядок не меняется
        // accessOrder = true - при использовании элемента порядок меняется: использованный элемент поднимается на верх

        Student student1 = new Student("John", 2);
        Student student2 = new Student("Jane", 3);
        Student student3 = new Student("Jack", 4);
        Student student4 = new Student("Jill", 1);

        students.put(4.2, student1);
        students.put(4.8, student2);
        students.put(3.9, student3);
        students.put(3.6, student4);

        System.out.println(students);  // В каком порядке были добавлены элементы, в таком они и остались. Сортировки нет
    }
}
