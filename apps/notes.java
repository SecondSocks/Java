package apps;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class notes {
    
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> note = new ArrayList<>();
    public static void main(String[] args) {

        while(true) {

            System.out.println("Выбирите действие, которое вы хотите совершить:");
            System.out.print("""
                1. Добавить запись
                2. Удалить запись
                3. Удалить все записи
                4. Проверить наличие записи
                5. Вывести все записи
                6. Вывести запись по номеру
                7. Узнать кол-во записей
                8. Заменить запись по номеру
                9. Удалить несколько записей по номерам
                >>> """);

            int variable = scanner.nextInt();

            if(variable == 1) {
                addElements();
            } else if(variable == 2) {
                delete();
            } else if(variable == 3) {
                deleteAll();
            } else if(variable == 4) {
                check();
            } else if(variable == 5) {
                outputAll();
            } else if(variable == 6) {
                output();
            } else if(variable == 7) {
                getListSize();
            } else if(variable == 8) {
                replaceElement();
            } else if(variable == 9) {
                removeAnyElements();
            } else {
                System.out.println("Вы не выбрали действие.");
            }

            System.out.print("\nВы хотите продолжить? (Да или Нет): ");
            String answer = scanner.nextLine();
            scanner.next();
            if(answer.equalsIgnoreCase("Нет")) {
                System.out.println("\nСессия завершена");
                break;
            }
        }
    }

    private static void addElements() {

        while(true){
            System.out.print("Добавьте запись (для выхода напишите \"Стоп\"): ");
            String element = scanner.nextLine();

            if(element.length() == 0) {
                break;
            } else {
                note.add(element);
                System.out.println("Запись добавлена");
            }
        }
        
    }

    private static void deleteAll() {

        System.out.print("Вы точно уверены? (Да или Нет): ");
        String answer = scanner.nextLine();

        if(answer.equalsIgnoreCase("Да")) {

            note.clear();
        } 
    }

    private static void delete() {

        while(true){
            System.out.print("Введите номер записи, которую вы хотите удалить: ");
            int number = scanner.nextInt();

            if(number <= note.size()) {
                note.remove(number);
                break;
            } else {
                System.out.println("Ошибка. Такого номера не существует");
            }
        }
    }

    private static void check() {

        System.out.print("Введите запись, которую вы хотите найти: ");
        String element = scanner.nextLine();
        scanner.next();
        if(note.contains(element)) {
            System.out.println("\nТакая запись существует");
        } else {
            System.out.println("\nЗапись не существует");
        }
    }

    private static void outputAll() {

        boolean check = note.isEmpty();
        int i = 1;
        if(check) {
            for(String element : note) {
                System.out.printf("%s. %s", i, element);
                i++;
            } 
        } else {
            System.out.println("В списке нет элементов");
        }
        
    }

    private static void output() {

        System.out.print("Введите номер записи, которую вы хотите вывести: ");
        int number = scanner.nextInt();

        System.out.printf("\n%s", note.get(number));
    }

    private static void getListSize() {

        System.out.printf("Кол-во записей: %s", note.size());
    }

    private static void replaceElement() {

        System.out.print("Введите номер записи, которую вы хотите заменить: ");
        int number = scanner.nextInt();

        System.out.print("\nВведите новую запись: ");
        String newElement = scanner.nextLine();

        note.set(number, newElement);
    }

    private static void removeAnyElements() {

        ArrayList<Integer> numbers = new ArrayList<>(100);
        ArrayList<String> elementsToDel = new ArrayList<>(100);
        System.out.println("Вводите номера записей, которые вы хотите удалить (для остановки нажмите Enter): ");
        
        while(scanner.hasNextInt()) {
            int number = scanner.nextInt();
            numbers.add(number);
        }

        Collections.sort(numbers);

        for(int i : numbers) {
            elementsToDel.add(note.get(i-1));
        }

        for(String elem : elementsToDel) {
            note.remove(elem);
        }
    }
}
