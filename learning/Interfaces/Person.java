package learning.Interfaces;

public class Person implements Info{
    
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.printf("Hello. my name is %s\n", name);
    }

	@Override
	public void showInfo() {
		System.out.printf("Hello. my name is %s\n", name);
	}
}
