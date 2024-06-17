package java1000;

import java.util.Arrays;
import java.util.Scanner;

public class TimeSort {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите кол-во временных отрезков: ");
        int value = scanner.nextInt();

        int[][] times = getTimes(value);
        for (int i = 0; i < times.length-1; i++) {
            if (times[i][0] > times[i+1][0]) {
                int[] temp = times[i+1];
                times[i+1] = times[i];
                times[i] = temp;
            } else if (times[i][0] == times[i+1][0]) {
                if (times[i][1] > times[i+1][1]) {
                    int[] temp = times[i+1];
                    times[i+1] = times[i];
                    times[i] = temp;
                } else if (times[i][1] == times[i+1][1]) {
                    if (times[i][2] > times[i+1][2]) {
                        int[] temp = times[i+1];
                        times[i+1] = times[i];
                        times[i] = temp;
                    }
                }
            }
        }

        for (int[] element : times) {
            for (int elem : element) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    private static int[][] getTimes(int value) {
        int[][] times = new int[value][3];
        for (int i = 0; i < value; i++) {
            for (int j = 0; j < 3; j++) {
                times[i][j] = scanner.nextInt();
            }
        }
        return times;
    }
}
