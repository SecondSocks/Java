package learning.Interfaces;

public class Animal implements Info {
    // Класс может наследовать только один класс, но реализовать нексколько интерфейсов
    // Класс обязан исполнять все методы интерфейса
    
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public void setID(int id) {
        this.id = id;
    }
    public void sleep() {
        System.out.println("Животное спит");
    }

	@Override
	public void showInfo() {
		System.out.printf("My ID is %d\n", id);
	}
}
