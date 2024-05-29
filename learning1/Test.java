package learning1;
import learning1.Forest.Squirel; // Импорт пакетов
import learning1.Forest.Trees;
import java.util.Scanner;


public class Test {
	
	public static void main(String[] args) {
		/* Импорт пакетов
		Trees tree1 = new Trees();
		Squirel squirel = new Squirel();
		Scanner scan = new Scanner(System.in);
		*/
		
		Animal animal = new Animal();
		Dog dog = new Dog();
		animal.eat();
		dog.eat();
		
		Animal animal1 = new Dog();
		Dog dog1 = new Dog();
		// К объекту класса Dog мы можем обращаться через перменную родительского типа
		//animal1.bark(); - Ошибка! Так как объект родительского типа можемт реализовывать методы только родительского типа
		dog1.bark();
		animal1.eat(); // Вызывается метод переопределенный в потомке класса
		// Такой метод называется позднее связывание
		
		Animal animal2 = new Animal();
		Dog dog2 = new Dog();
		Cat cat = new Cat();
		test(animal2);
		test(dog2);
		test(cat);
	}
	
	public static void test(Animal animal) {
		
		animal.eat();
	}
}