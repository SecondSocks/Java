package java1000;

import java.util.Scanner;
import java.util.Arrays;

public class QuickSort {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите кол-во элементов: ");
        int value = scanner.nextInt();

        int[] array = fillArray(value);
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static int[] fillArray(int value) {
        int[] array = new int[value];
        for (int i = 0; i < value; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0) {
            return;  // Если массива не существует, завершить выполнение
        }

        if (low >= high) {
            return;  // Если уже не получается делить, завершить выполнение
        }

        // Выбор опорного элемента
        int middle = low + (high - low) / 2;
        int pivot = array[middle];  // Опорный элемент

        // Деление на подмассивы, которые больше и меньше опорного элемента
        int i = low;
        int j = high;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // Рекурсия для сортировки меньшего и большего массивов
        if (low < j) {
            quickSort(array, low, j);
        }
        if (high > i) {
            quickSort(array, i, high);
        }
    }
}
