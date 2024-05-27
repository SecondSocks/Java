package learning1;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class LearnGenerics {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ///////// No Generics ///////////
        List massive = new ArrayList();

        massive.add("Cat");  // Все объекты превращаются в объекты класса Object
        massive.add(12);
        massive.add(true);

        String firstObject = (String) massive.get(0);  // Требуется сделать нисходящее преобразование
        System.out.println(massive);

        ///////// Generics /////////
        List<String> animals = new ArrayList<String>();

        System.out.println("Введите 3 названия животных: ");
        for(int i = 0; i < 3; i++) {
            String animal = scan.nextLine();
            animals.add(animal);
        }

        String firstAnimal = animals.get(0);  // Преобразований делать не нужно.
        // Все объекты массива принадлежат классу String

        //////////// Java 7 ////////////
        List<String> birds = new ArrayList<>();
    }
}
