package java1000;

import java.util.Scanner;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите числа A и B: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int multiple = 0;
        for (int i = 1; i < 46341; i++) {
            if (i % a == 0 && i % b == 0) {
                multiple = i;
                break;
            }
        }
        System.out.println(multiple);  // НОК
    }
}
