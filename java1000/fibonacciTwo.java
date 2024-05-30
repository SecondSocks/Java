package java1000;

import java.util.Scanner;
import java.util.ArrayList;

public class fibonacciTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> fibonacciNumbers = new ArrayList<>();
        fibonacciNumbers.add(1);
        fibonacciNumbers.add(1);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        int fibonacci = 0, answer = 0;
        if (n == 0) {
            System.out.println(0);
        } else if (n == 1) {
            System.out.println("1\n1");
        } else {
            for(int i = 0; i <= n; i++) {
                fibonacciNumbers.add(fibonacciNumbers.get(i) + fibonacciNumbers.get(i+1));
                if (fibonacciNumbers.get(i+2) == n) {
                    fibonacci = n;
                    answer = 1;
                    break;
                }
            }
        }

        if (answer == 1) {
            System.out.printf("%d\n%d", answer, fibonacciNumbers.indexOf(fibonacci)+1);
        } else {
            System.out.println(0);
        }

    }
}
