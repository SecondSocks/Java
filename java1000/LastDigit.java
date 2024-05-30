package java1000;

import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число A: ");
        double a = scanner.nextInt();
        System.out.print("Введите число B: ");
        double b = scanner.nextInt();

        int ab = (int) Math.pow(a, b);
        String str = String.valueOf(ab);
        System.out.println(str.charAt(str.length()-1));
    }
}
