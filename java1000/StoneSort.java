package java1000;

import java.util.ArrayList;
import java.util.Scanner;

public class StoneSort {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите кол-во элементов: ");
        int value = scanner.nextInt();

        ArrayList<Integer> list = fillList(value);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j+1) < list.get(j)) {
                    int temp = list.get(j+1);
                    list.set(j+1, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        for (int x : list) {
            System.out.printf("%d ", x);
        }
    }

    private static ArrayList<Integer> fillList(int value) {
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Вводите числа: ");
        for (int i = 0; i < value; i++) {
            list.add(scanner.nextInt());
        }
        return list;
    }
}
