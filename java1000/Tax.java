package java1000;

import java.util.Scanner;

public class Tax {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите число фирм: ");
        int n = scanner.nextInt();

        int[] profit = getProfits(n);
        int[] percent = getPercents(n);

        int maxTax = 0;
        int numberOfFirm = 1;
        for (int i = 0; i < profit.length; i++) {
            if (percent[i] == 0) {
                continue;
            } else if(profit[i] / percent[i] > maxTax) {
                maxTax = profit[i] * (percent[i] / 100);
                numberOfFirm = i+1;
            }
        }
        System.out.println(numberOfFirm);
    }

    private static int[] getProfits(int n) {
        int[] profits = new int[n];
        for (int i = 0; i < n; i++) {
            profits[i] = scanner.nextInt();
        }
        return profits;
    }

    private static int[] getPercents(int n) {
        int[] percents = new int[n];
        for (int i = 0; i < n; i++) {
            percents[i] = scanner.nextInt();
        }
        return percents;
    }
}
