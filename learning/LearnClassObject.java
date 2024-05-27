package learning;

public class LearnClassObject {
    
    public static void main(String[] args) {
        
        Humans bob = new Humans("Bob", 21);
        System.out.println(bob); // learning.Human@28a418fc 
        // Тут был скрытно вызван метод .toString()
        System.out.println(bob.toString()); // Предыдущий вывод и этот равны
        // После переопределения метода
        System.out.println(bob.toString()); // Bob, 21
        System.out.println(bob);  // Bob, 21
    }
}

class Humans {

    private String name;
    private int age;

    public Humans(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ", " + age;
    }
}