package java1000;

import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите кол-во элементов в списке: ");
        int value = scanner.nextInt();

        int[] array = fillArray(value);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static int[] fillArray(int value) {
        int[] array = new int[value];

        System.out.println("Вводите числа: ");
        for (int i = 0; i < value; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
