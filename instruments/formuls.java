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

    public static void squareOfSquare() {

        System.out.print("Введите сторону квадрата: ");
        double a = scan.nextDouble();

        System.out.printf("\n%s", a*a);
    }

    public static void squareOfTriangle() {

        System.out.print("Введите основание треугольника: ");
        double a = scan.nextDouble();

        System.out.print("\nВведите высоту треугольника: ");
        double h = scan.nextDouble();

        System.out.printf("\n%s", a / 2 * h);
    }

    public static void squareOfRectangle() {

        System.out.print("Введите первую сторону прямогульника: ");
        double a = scan.nextDouble();

        System.out.print("\nВведите вторую сторону прямоугольника: ");
        double b = scan.nextDouble();

        System.out.printf("\n%s", a * b);
    }

    public static void squareOfTrapezoid() {

        System.out.print("Введите первое основание трапеции: ");
        double a = scan.nextDouble();

        System.out.print("\nВведите второе основание трапеции: ");
        double b = scan.nextDouble();

        System.out.print("\nВведите высоту трапеции: ");
        double h = scan.nextDouble();

        System.out.printf("\n%s", (a+b) / 2 * h);
    }
}
