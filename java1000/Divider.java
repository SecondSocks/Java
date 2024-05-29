package java1000;
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scan.nextInt();
        System.out.print("Введите второе число: ");
        int b = scan.nextInt();

        int max = Math.max(a, b);
        int divider = 0;
        for(int i = 1; i <= max; i++) {
            if(a % i == 0 && b % i == 0) {
                divider = i;
            }
        }

        System.out.printf("НОД: %d", divider);
    }
}
