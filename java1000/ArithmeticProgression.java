package java1000;
import java.util.Scanner;

public class ArithmeticProgression {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите первый элемент прогрессии: ");
        int a1 = scan.nextInt();
        System.out.print("Введите второй элемент прогрессии: ");
        int a2 = scan.nextInt();
        System.out.print("Введите элемент, который хотите найти: ");
        int n = scan.nextInt();

        int d = a2 - a1; // Шаг
        // Формула: an = a1 + d(n-1)
        int an = a1 + d * (n - 1);
        System.out.printf("%d элемент = %d", n, an);
    }
}
