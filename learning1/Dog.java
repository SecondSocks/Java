package learning1;

public class Dog extends Animal {
	
	public void bark() {
		System.out.println("Гав!");
	}
	
	@Override  // Анотация о переопределении
	public void eat() {
		System.out.println("Dog is eat");
	}
}