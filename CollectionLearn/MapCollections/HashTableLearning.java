/*(Синхронизирован) HashTable - устаревший класс работает как HashMap. Ни ключ, ни значение не могут быть null.
* Если требуется многопоточность, следует использовать ConcurrentHashMap*/
package CollectionLearn.MapCollections;

import java.util.Hashtable;

public class HashTableLearning {
    public static void main(String[] args) {
        Hashtable<Double, Student> hashTable = new Hashtable<>();

        Student student1 = new Student("John", 2);
        Student student2 = new Student("Jane", 3);
        Student student3 = new Student("Jack", 4);
        Student student4 = new Student("Jill", 1);

        hashTable.put(4.2, student1);
        hashTable.put(4.8, student2);
        hashTable.put(3.9, student3);
        hashTable.put(3.6, student4);
    }
}
