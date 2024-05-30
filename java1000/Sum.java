package java1000;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число: ");
        int a = sc.nextInt();

        System.out.println(sum(a));
    }

    private static int sum(int a) {
        if (a == 0) {
            return 0;
        }
        return a + sum(a-1);
    }
}
