package java1000;

import java.util.Scanner;
import java.util.ArrayList;

public class SimilarArrays {
    private static final Scanner scanner = new Scanner(System.in);
    private static int calls = 1;

    public static void main(String[] args) {
        System.out.print("Введите кол-во элементов в массиве: ");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(scanner.nextInt());
        arrayList.add(scanner.nextInt());

        ArrayList<Integer> arrayList1 = fillArray(arrayList.get(0));
        ArrayList<Integer> arrayList2 = fillArray(arrayList.get(1));

        boolean isSimilar = true;
        if (arrayList1.size() >= arrayList2.size()) {
            for (int i = 0; i < arrayList1.size(); i++) {
                if (!arrayList2.contains(arrayList1.get(i))) {
                    isSimilar = false;
                    break;
                }
            }
        } else if(arrayList2.size() >= arrayList1.size()) {
            for (int i = 0; i < arrayList2.size(); i++) {
                if (!arrayList1.contains(arrayList2.get(i))) {
                    isSimilar = false;
                    break;
                }
            }
        }
        if (isSimilar) {
            System.out.println("Массивы похожи");
        } else {
            System.out.println("Массивы не похожи");
        }
    }

    private static ArrayList<Integer> fillArray(int value) {
        System.out.printf("Введите данные массива №%d\n", calls++);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < value; i++) {
            arrayList.add(scanner.nextInt());
        }
        return arrayList;
    }
}
