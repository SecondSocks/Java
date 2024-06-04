package tasks;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class task1 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> list = fillList();

        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i) > list.get(i+1)) {
                int temp = list.get(i+1);
                list.set(i+1, list.get(i));
                list.set(i, temp);
            }
        }

        System.out.print("Введите элемент, который вы хотите найти: ");
        int num = scanner.nextInt();

        int index = find(list, num);
        if (index >=0 ) {
            System.out.printf("Число %d находится под индексом %d", num, index);
        } else {
            System.out.println("Элемент не удалось найти");
        }
        
    }

    private static ArrayList<Integer> fillList() {
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Введите кол-во элементов списка: ");
        int value = scanner.nextInt();

        System.out.println("Вводите элементы: ");
        for (int i = 0; i < value; i++) {
            list.add(scanner.nextInt());
        }
        return list;
    }

    private static int find(ArrayList<Integer> list, int target) {
        return Collections.binarySearch(list, target);
    }
}