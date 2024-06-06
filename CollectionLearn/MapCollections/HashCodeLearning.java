package CollectionLearn.MapCollections;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;

public class HashCodeLearning {
    public static void main(String[] args) {
        Map<Human, Integer> peoples = new HashMap<>();
        Human human1 = new Human("Ivan", "Surikov", 20);
        Human human2 = new Human("Kolya", "Tipov", 32);
        Human human3 = new Human("Georgiy", "Foskin", 18);
        peoples.put(human1, 20000);
        peoples.put(human2, 40000);
        peoples.put(human3, 19800);
        System.out.println(peoples);

        Human human4 = new Human("Ivan", "Surikov", 20);
        boolean result = peoples.containsKey(human4);  // Если не переопределить hashCode || equals => false
        System.out.println(result);
        System.out.println(human1.equals(human4));

        System.out.println(human1.hashCode());
        System.out.println(human4.hashCode());
        System.out.println(human3.hashCode());
    }
}

class People {
    private final String name;
    private final String surname;
    private final int age;

    public People(String name, String surname, int age) {
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
        People human = (People) anotherPeople;
        return age == human.age && Objects.equals(name, human.name) && Objects.equals(surname, human.surname);
    }

    @Override
    public int hashCode() {
        // return Objects.hash(name, surname, age); - стандартная реализация
        return name.length() + surname.hashCode() + age; // - вариант собственной реализации
        // Желательно избегать коллизии - одинаковых hashCode
    }
}
