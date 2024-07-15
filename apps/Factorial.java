package apps;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для расчета факториала: ");
        int number = scanner.nextInt();
        System.out.printf("Факториал %d = %d", number, factorial(number));
    }

    private static int factorial(int num) {
        if (num == 0) return 0;
        if (num == 1) return num;
        return num * factorial(num - 1);
    }
}
