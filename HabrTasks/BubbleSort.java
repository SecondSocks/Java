package HabrTasks;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.toIntExact(Math.round(Math.random() * 1000));
        }
        int[] sotredArray = sort(array);
        System.out.printf("Array: %s\n", Arrays.toString(array));
        System.out.printf("Sorted array: %s\n", Arrays.toString(sotredArray));
    }

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
