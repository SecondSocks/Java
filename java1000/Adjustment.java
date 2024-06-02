package java1000;

import java.util.Scanner;

public class Adjustment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите уравнение: ");
        String adjustment = scanner.nextLine();
        String[] chars = adjustment.split("");

        String operation = chars[1];
        int indexOfX = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i].equalsIgnoreCase("X")) {
                indexOfX = i;
                break;
            }
        }

        int answer = 0;
        switch (operation) {
            case "+":
                if (indexOfX == 0) {
                    for (int i = -9; i <= 9; i++) {
                        if (i + Integer.parseInt(chars[2]) == Integer.parseInt(chars[4])) {
                            answer = i;
                            break;
                        }
                    }
                } else if (indexOfX == 2) {
                    for (int i = -9; i <= 9; i++) {
                        if (Integer.parseInt(chars[0]) + i == Integer.parseInt(chars[4])) {
                            answer = i;
                            break;
                        }
                    }
                }
                break;

            case "-":
                if (indexOfX == 0) {
                    for (int i = -9; i <= 9; i++) {
                        if (i - Integer.parseInt(chars[2]) == Integer.parseInt(chars[4])) {
                            answer = i;
                            break;
                        }
                    }
                } else if (indexOfX == 2) {
                    for (int i = -9; i <= 9; i++) {
                        if (Integer.parseInt(chars[0]) - i == Integer.parseInt(chars[4])) {
                            answer = i;
                            break;
                        }
                    }
                }
                break;
        }
        System.out.printf("Ответ: %d", answer);
    }
}
