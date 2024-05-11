package instruments;
import java.util.Scanner;

public class refactorString {
    
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();  // Получаем строку

        System.out.print("\nВведите, какой символ вы хотите вставить: ");
        String chars = scanner.nextLine();  // Получаем символ, который хотим вставить

        StringBuilder result = new StringBuilder();  // Создаем переменную типа StringBuilder (тип, который можно изменять большое кол-во раз)

        for (int i = 0; i < input.length(); i++) {  // создаем переменную со значением 0; проверяем условие, что значение i < длины строки; i + 1
            result.append(input.charAt(i));  // В данной строке находим символ по индексу i и добавляем его в перменную result
            if (i < input.length() - 1) {  // Если значение i < длины строки - 1, то в переменную result добавляем символ
                result.append(chars);
            }
        }

        System.out.printf("Результат: %s", result);
    }
}
