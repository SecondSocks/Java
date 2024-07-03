package learning4;

public class EqualsLearn {
    public static void main(String[] args) {
        Animals animal1 = new Animals(1);
        Animals animal2 = new Animals(1);
        System.out.println(animal1 == animal2);  // False, даже если id будут равны
        // Это сравнение сравнивает ссылки. Для ссылочных нельзя использовать "==", т.к объекты лежат в разных участках памяти
        System.out.println(animal1.equals(animal2));  // equals() - тоже самое, что и "==", но его можно переопределить
    }
}

class Animals {
    private final int id;

    public Animals(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        Animals animal = (Animals) obj;
        return this.id == animal.id;
    }
}