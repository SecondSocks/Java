package learning.Interfaces;

public class Person {
    
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println(name);
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void sayHello() {
        System.out.println("Hello. my name is " + name);
    }
}
