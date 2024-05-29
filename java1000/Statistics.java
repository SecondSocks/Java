package java1000;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class Statistics {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите кол-во выписанных дней: ");
        int days = scan.nextInt();

        ArrayList<Integer> printedDays = new ArrayList<>(days);
        printedDays = fillArray(printedDays, days);

        ArrayList<Integer> evenDays = new ArrayList<>();
        ArrayList<Integer> oddDays = new ArrayList<>();

        for(int date : printedDays) {
            if(date % 2 == 0) {
                evenDays.add(date);
            } else if(date % 2 == 0) {
                oddDays.add(date);
            } else {
                oddDays.add(date);
            }
        }

        for(int odd : oddDays) {
            System.out.print(odd + " ");
        }
        System.out.println();
        for(int even : evenDays) {
            System.out.print(even + " ");
        }

        if(oddDays.size() < evenDays.size()) {
            System.out.println("\nYES");
        } else {
            System.out.println("\nNO");
        }
    }

    private static ArrayList<Integer> fillArray(ArrayList<Integer> array, int days) {

        System.out.println("Введите даты: ");
        for(int i = 0; i < days; i++) {
            int date = scan.nextInt();
            array.add(date);
        }

        return array;
    }
}
