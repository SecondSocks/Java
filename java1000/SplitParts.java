package java1000;

import java.util.Scanner;

public class SplitParts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ввдетие число: ");
        int num = scanner.nextInt();
        System.out.print("Введите кол-во частей: ");
        int parts = scanner.nextInt();

        int[] nums = new int[parts];
        for (int i = 0; i < parts; i++) {
            nums[i] = num / parts;
        }

        int sum = 0;
        for (int elem : nums) {
            sum += elem;
        }
        if (sum != num) {
            nums[parts - 1] = nums[parts - 1]+1;
        }

        for(int elem : nums) {
            System.out.printf("%d ", elem);
        }
    }
}
