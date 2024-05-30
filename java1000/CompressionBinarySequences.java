package java1000;

import java.util.Scanner;
import java.util.Arrays;

public class CompressionBinarySequences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] chars = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
                "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        System.out.print("Введите число: ");
        String num = scanner.nextLine();
        String[] binary = num.split("1");

        StringBuilder sb = new StringBuilder();
        for (String s : binary) {
            sb.append(chars[s.length()]);
        }
        System.out.println(sb);
    }
}
