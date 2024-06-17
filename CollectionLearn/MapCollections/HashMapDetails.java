/*(Не синхронизирован) HashMap - в основе его лежит массив. Элементы данного массива - структуры LinkedList.
* Данные этой структуры заполняются нашими данными (Скорость O(1)-O(n). Если коллизии на один индекс очень много,
* то LinkedList превращается в дерево, где правый элемент больше левого. Данные ключа обязательно должны быть неизменны.
* Для этого все поля должны быть final & private, должны быть только геттеры, а также желательно сделать class final. */
package CollectionLearn.MapCollections;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;

public class HashMapDetails {
    public static void main(String[] args) {
        Map<Human, Double> map = new HashMap<>();

        Human human1 = new Human("Larry", "Willson", 22);
        Human human2 = new Human("Garry", "Henderson", 42);
        Human human3 = new Human("Bob", "Rosenfort", 19);
        Human human4 = new Human("John", "Smith", 32);

        map.put(human1, 1.72); map.put(human2, 1.88); map.put(human3, 1.83); map.put(human4, 1.91);
        System.out.println(map);

        System.out.println("{");
        for (Map.Entry<Human, Double> entry : map.entrySet()) {
            System.out.printf("    %s : %s,\n", entry.getKey(), entry.getValue());
        }
        System.out.println("}");

        int initialCapacity = 10;
        float loadFactor = 0.8f;
        Map<Integer, String> map1 = new HashMap<>(initialCapacity, loadFactor);
    }
}

class Human {
    private final String name;
    private final String surname;
    private final int age;

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s %s age: %d ", name, surname, age);
    }

    @Override
    public boolean equals(Object anotherPeople) {
        if (this == anotherPeople) return true;
        if (anotherPeople == null || getClass() != anotherPeople.getClass()) return false;
        Human human = (Human) anotherPeople;
        return age == human.age && Objects.equals(name, human.name) && Objects.equals(surname, human.surname);
    }

    @Override
    public int hashCode() {
        // return Objects.hash(name, surname, age); - стандартная реализация
        return name.length() + surname.hashCode() + age; // - вариант собственной реализации
        // Желательно избегать коллизии - одинаковых hashCode
    }
}
