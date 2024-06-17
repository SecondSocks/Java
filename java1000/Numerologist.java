package java1000;

import java.util.Scanner;

public class Numerologist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите возраст человека в секундах: ");
        String age = scanner.nextLine();

        int counter = 0;
        if (age.length() < 1) {
            System.out.printf("%s %d", age, counter);
        } else {
            while (age.length() != 1) {
                String[] nums = age.split("");

                int num = 0;
                for (String s : nums) {
                    num += Integer.parseInt(s);
                }

                age = String.valueOf(num);
                counter++;
            }
            System.out.printf("%s %d", age, counter);
        }
    }
}
