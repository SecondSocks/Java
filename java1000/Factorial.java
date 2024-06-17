package java1000;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число, которое хотите возвести в факториал: ");
        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }

    private static int factorial(int n) {
        if (n == 0) {
            return n;
        } else if (n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}
