package learning4;

public class AbstractClasses {
    public static void main(String[] args) {
        // Animal animal = new Animal(); - объект класса нельзя создавать, т.к он является абстрактным. Концепция
        Cat cat = new Cat();  // Сущность
        Dog dog = new Dog();  // Сущность

        cat.makeSound();
        dog.makeSound();

        cat.eat();
        dog.eat();
    }
}
