package learning1.Wildcards;

public class Dog extends Animal{

    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}
