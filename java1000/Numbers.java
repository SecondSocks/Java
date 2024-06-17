package java1000;

import java.util.Scanner;
import java.util.ArrayList;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        String number = scanner.nextLine();
        ArrayList<String> maxNumbers = getArray(number);
        ArrayList<String> minNumbers = new ArrayList<>(maxNumbers);

        StringBuilder maxNumber = new StringBuilder();
        while (!maxNumbers.isEmpty()) {
            int max = Integer.parseInt(maxNumbers.getFirst());
            for (int i = 0; i < maxNumbers.size(); i++) {
                if (max < Integer.parseInt(maxNumbers.get(i))) {
                    max = Integer.parseInt(maxNumbers.get(i));
                }
            }
            maxNumber.append(max);
            maxNumbers.remove(String.valueOf(max));
        }

        StringBuilder minNumber = new StringBuilder();
        while (!minNumbers.isEmpty()) {
            int min = Integer.parseInt(minNumbers.getFirst());
            for (int i = 0; i < minNumbers.size(); i++) {
                if (min > Integer.parseInt(minNumbers.get(i))) {
                    min = Integer.parseInt(minNumbers.get(i));
                }
            }
            minNumber.append(min);
            minNumbers.remove(String.valueOf(min));
        }

        if (minNumber.charAt(0) == '0') {
            char temp = minNumber.charAt(0);
            minNumber.setCharAt(0, minNumber.charAt(1));
            minNumber.setCharAt(1, temp);
        }

        System.out.printf("%s\n%s", maxNumber, minNumber);
    }

    private static ArrayList<String> getArray(String number) {
        String[] array = number.split("");
        ArrayList<String> list = new ArrayList<>();
        for (String elem : array) {
            list.add(elem);
        }
        return list;
    }
}
