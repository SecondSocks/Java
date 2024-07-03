package learning;

public class Constructors {
    
    public static void main(String[] args) {
        

    }
}

class Human { // Этот класс подстраивается под каждую ситуацию

    private final String name;
    private final int age;

    /* Блок конструкторов */
    public Human() {
        this("John Doe", 18);
    }

    public Human(String name) {
        this.name = name;
        age = 18;
    }

    public Human(int age) {
        this.age = age;
        name = "John Doe";
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;   
    }
}

class AngryHuman { // В этом классе обязательно вводить все параметры

    private final String name;
    private final int age;

    public AngryHuman(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Peoples { /* Этот класс имеет конструктор по умолчанию, 
    поэтому в зависимости от ситуации меняется только переданный параметр */ 

    private String name;
    private int age;

    {
        name = "John Doe";
        age = 18;
    }

    public Peoples(String name) {
        this.name = name;
    }

    public Peoples(int age) {
        this.age = age;
    }

    public Peoples(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
