package learning1;

public class AnonimClass {

    public static void main(String[] args) {

        AbleToEat animal = new AbleToEat() {  // Так создается анонимный класс. Создается класс, который реализует
            // методы интерфейса AbleToEat, в котором мы можем реализовать их.
            @Override
            public void eat() {
                System.out.println("Is eating");
            }
        };
    }
}

interface AbleToEat {
    void eat();
}