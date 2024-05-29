package learning1.Wildcards;
import java.util.List;
import java.util.ArrayList;

public class Wildcards {

    public static void main(String[] args) {

        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        test(listOfAnimal);

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog("Bobby"));
        listOfDogs.add(new Dog("Garry"));

        //test(listOfDogs);  - ОШИБКА! обычно мы могли передавать в параметры объекты, классы которых наследовались
        // от род. типа, указанного в параметрах.
        // В случае с Generics так не работает
        test1(listOfDogs); // Если в Generics указать Wildcards, то ошибка пропадет
    }

    private static void test(List<Animal> list){

        for(Animal animal : list) {
            System.out.println(animal);
        }
    }

    private static void test1(List<? extends Animal> list) {  // Wildcards означает, что в параметры мы можем передать
        // любой объект класса Animal, и всех других, которые наследуются от него

        for(Animal animal : list) {
            animal.eat();
        }
    }

    private static void test2(List<? super Dog> list) {  // Wildcards означает, что в параметры мы можем передать
        // любой объект класса Dog, а также объекта класса, которой унаследован классом Dog

    }
}
