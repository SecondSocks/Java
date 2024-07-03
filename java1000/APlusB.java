package java1000;
import java.util.Scanner;


public class APlusB {
    
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.print("Введите два числа: ");
        int a = scan.nextInt(), b = scan.nextInt();
        System.out.println(sum(a, b));
    }

    private static int sum(int a, int b) { return a + b; }
}
