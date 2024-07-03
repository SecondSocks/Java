package HabrTasks;

import java.util.Scanner;
import java.util.Arrays;

public class MinMaxAndAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value of numbers for generation: ");
        int value = scanner.nextInt();

        int[] array = new int[value];
        for (int i = 0; i < value; i++) {
            array[i] = Math.toIntExact(Math.round(Math.random() * 1000));
        }

        System.out.printf("Array of numbers: %s\n", Arrays.toString(array));

        System.out.printf("Max number: %d\n", max(array));
        System.out.printf("Min number: %d\n", min(array));
        System.out.printf("Avg: %d\n", avg(array));
    }

    private static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i ++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }

    private static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }

    private static int avg(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result / array.length;
    }
}
