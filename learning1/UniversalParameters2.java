package learning1;

public class UniversalParameters2 {
    public static void main(String[] args) {
        Animals animal = new Animals("b789ac2");
        Animals animal2 = new Animals(708840);

        System.out.println(animal.getId());
        System.out.println(animal2.getId());
    }
}

class Animals {
    private final String id;

    <Type>Animals(Type id) {
        this.id = String.valueOf(id);
    }

    public String getId() { return id;}
}

/*Конструкторы так же могут быть обобщенными. В этом случае универсальный параметр указывается перед конструктором.*/