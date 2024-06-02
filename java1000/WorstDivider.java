package java1000;

import java.util.Scanner;

public class WorstDivider {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        int worstDivider = 1, number = 1;
        while (number <= n) {
            if (n % number == 0) {
                String num = String.valueOf(number);
                String strWorstDivider = String.valueOf(worstDivider);
                String[] nums = num.split("");
                String[] numsWorstDivider = strWorstDivider.split("");

                int sumOfNumbers = 0;
                for (String s : nums) {
                    sumOfNumbers += Integer.parseInt(s);
                }

                int sumOfWorstDivider = 0;
                for (String s : numsWorstDivider) {
                    sumOfWorstDivider += Integer.parseInt(s);
                }

                if (sumOfNumbers < sumOfWorstDivider) {
                    worstDivider = number;
                } else if (sumOfNumbers == sumOfWorstDivider) {
                    if (number > worstDivider) {
                        worstDivider = number;
                    }
                }
            }
            number++;
        }
        System.out.println(worstDivider);
    }
}
