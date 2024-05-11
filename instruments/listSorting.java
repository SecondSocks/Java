package instruments;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;


public class listSorting {
    
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Integer> nums = new ArrayList<>();  // Инициализация списка, которой принимает данные типа Integer

    public static void main(String[] args) {

        System.out.println("Введите числа (для завершения введите любую букву): ");

        while (scanner.hasNextInt()) {  // Список работает, пока входные данные соотвествуют типу Integer
            int number = scanner.nextInt();
            nums.add(number);  // Данные переменной number добавляются в список nums
        }

        Collections.sort(nums);  // Сортировка данных в списке

        for (int i : nums) {  // Перебор элементов списка
            System.out.printf("%s ", i);
        }
    }
}
