package instruments;
import java.util.Scanner;


public class formuls {

    final static double PI = 3.14D;
    static Scanner scan = new Scanner(System.in);

    public static void pifagor_g() {

        System.out.print("Введите первый катет: ");
        double a = scan.nextDouble();

        System.out.print("\nВведите второй катет: ");
        double b = scan.nextDouble();

        double c = a*a + b*b;
        System.out.println(c);
    }

    public static void pifagor_k() {

        System.out.print("Введите гипотенузу: ");
        double a = scan.nextDouble();

        System.out.print("\nВведите катет: ");
        double b = scan.nextDouble();

        double c = a*a + b*b;
        System.out.println(c);
    }

}
