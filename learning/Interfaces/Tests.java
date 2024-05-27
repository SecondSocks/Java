package learning.Interfaces;

public class Tests {

	public static void main(String[] args) {
		
		Animal animal1 = new Animal(11002232);
		Person person1 = new Person("Bobby");
		animal1.sleep();
		person1.sayHello();
		animal1.showInfo();
		person1.showInfo();
		
		Info animal2 = new Animal(1);  // Тип не совпадает с классом
		Info person2 = new Person("Tom");  // Можно так делать, потому что класс реализует интерфейс
		// Если используется тип-интерфейс, то это означает, что нам важны только объекты и методы интерфейса
		animal2.showInfo(); 
		person2.showInfo();
		// Получается так, что нам доступны исключительно методы описанные внутри интерфейса
		// Методы класса мы использовать с таким типом не можем
		outputInfo(animal2);
		outputInfo(person2);
		
		Animal animal3 = new Animal(3);
		Person person3 = new Person("Garry");
		outputInfo(animal3);
		// Мы можем подать в метод объекты другого типа, но реализующих интерфейс Info
		outputInfo(person3);
	}
	
	public static void outputInfo(Info info) {
		info.showInfo();
	}
}