package java1000;
import java.util.Scanner;
import java.util.ArrayList;

public class Watermelon {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите кол-во арбузов: ");
        int n = scan.nextInt();

        System.out.println("Вводите вес арбузов: ");
        ArrayList<Integer> weights = new ArrayList<>(n);
        for(int i = 0; i < n; i++) {
            int a = scan.nextInt();
            weights.add(a);
        }

        int minWeight = weights.get(0);
        int maxWeight = weights.get(0);

        for(int i : weights) {
            if(i < minWeight) {
                minWeight = i;
            } else if(i > maxWeight) {
                maxWeight = i;
            }
        }

        System.out.printf("Арбуз себе весит %d, а арбуз теще весит %d", maxWeight, minWeight);
    }
}
