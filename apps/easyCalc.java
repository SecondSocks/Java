package apps;
import java.util.Scanner;

public class easyCalc {
    
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int num1 = getNumber();
        int num2 = getNumber();
        char operation = getOperation();
        int result = calc(num1, num2, operation);

        System.out.printf("Результат: %s", result);
    }

    private static int getNumber() {

        System.out.print("Введите число: ");
        int num;

        if(scanner.hasNextInt()) {  // Проверка, введено ли число
            num = scanner.nextInt();
        } else {
            System.out.print("\nОшибка. Попробуйте заново: ");
            scanner.next();  // Рекурсия
            num = scanner.nextInt();
        }

        return num;
    }

    private static char getOperation() {

        System.out.print("Введите операцию: ");
        char operation;

        if(scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.print("\nОшибка. Попробуйте заново: ");
            scanner.next();
            operation = scanner.next().charAt(0);
        }

        return operation;
    }

    public static int calc(int num1, int num2, char operation) {

        int result;
        switch(operation) {
            case '+': 
                result = num1 + num2; 
                break;
            case '-': 
                result = num1 - num2; 
                break;
            case '*': 
                result = num1 * num2; 
                break;
            case '/': 
                result = num1 / num2; 
                break;
            default:
                System.out.print("Ошибка. Попробуйте заново: ");
                result = calc(num1, num2, getOperation());
        }

        return result;
    }
}
