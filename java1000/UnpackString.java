package java1000;

import java.util.Scanner;
import java.lang.NumberFormatException;

public class UnpackString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        String[] chars = str.split("");

        StringBuilder string = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            try {
                for (int j = 0; j < Integer.parseInt(chars[i]); j++) {
                    string.append(chars[i+1]);
                }
            } catch (NumberFormatException e) {
                continue;
            }
        }
        System.out.println(string);
    }
}
