package java1000;

import java.util.Scanner;
import java.util.Arrays;

public class Eleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        String number = scanner.nextLine();
        String[] nums = number.split("");

        int evenSum = 0, oddSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0){
                evenSum += Integer.parseInt(nums[i]);
            } else {
                oddSum += Integer.parseInt(nums[i]);
            }
        }
        if ((evenSum - oddSum) % 11 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
