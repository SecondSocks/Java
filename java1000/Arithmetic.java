package java1000;
import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scan.nextInt();
        System.out.print("Введите второе число: ");
        int b = scan.nextInt();
        System.out.print("Введите ответ: ");
        int c = scan.nextInt();

        if(a*b == c) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
