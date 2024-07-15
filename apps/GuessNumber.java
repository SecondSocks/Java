package apps;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в числовую угадайку");

        boolean gameLoop = true;
        while (gameLoop) {
            System.out.print("Укажите минимальное число: ");
            int min = scanner.nextInt();
            System.out.print("Укажите максимальное число: ");
            int max = scanner.nextInt();
            int guessNumber = randomNumber(min, max);

            System.out.print("Выбирите сложность:\n1 - Легко\n2 - Средне\n3 - Тяжело\n>>> ");
            int difficult = scanner.nextInt();
            int attempts = switch (difficult) {
                case 1 -> 15;
                case 2 -> 10;
                case 3 -> 5;
                default -> 0;
            };

            while (true) {
                if (attempts == 0) {
                    System.out.println("Вы не угадали число");
                    break;
                }

                System.out.print("Введите число: ");
                int number = scanner.nextInt();

                if (number == guessNumber) {
                    System.out.println("Вы угадали число!");
                    break;
                } else if (number > guessNumber) {
                    System.out.println("Загаданное число меньше вашего");
                    attempts--;
                } else if (number < guessNumber) {
                    System.out.println("Загаданное число больше вашего");
                    attempts--;
                } else {
                    System.out.println("Неверные данные");
                }
            }

            System.out.println("Игра окончена");

            System.out.print("Хотите продолжить?\n1 - Да\n2 - Нет\n>>> ");
            int next;
            while (true) {
                next = scanner.nextInt();
                if (next == 1 || next == 2) break;
                else System.out.println("Неверные данные");
            }

            if (next == 2) gameLoop = false;
        }

        System.out.println("До скорых встреч");
    }

    private static int randomNumber(int min, int max) {
        max -= min;
        return  (int) (Math.random() * ++max) + min;
    }
}
