package learning1;

public class UpAndDowncasting {
	
	public static void main(String[] args){
		
		// Upcasting - высходящее преобразование
		Animal animal = new Dog();  // Объект рассматривается от родителя. От Dog до Animal
		Dog dog = new Dog();
		Animal animal2 = dog;  // Неявное преобразование
		
		// Downcasting - нисходящее преобразование
		Dog dog2 = (Dog)animal2;  // Явное преобразование
		Animal a = new Animal();
		Dog b = (Dog) a;
		// Преобразование меняет ссылку на объект
		//b.bark(); // Метод есть, но выведет ошибку
		// Это происходит из-за того, что первоначально объект был типа Animal, который не имеет в себе данный метод
		
		/* Итог: высходящее преобразование безопасно, а нисходящее - нет
		
		*/
	}
}