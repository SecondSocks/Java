package java1000;
import java.util.Scanner;

public class BoltsAndNuts {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите начальное число болтов: ");
        int k1 = scan.nextInt();
        System.out.print("Введите процент потерянных деталей: ");
        int l1 = scan.nextInt();
        System.out.print("Введите стоимость одного болта: ");
        int m1 = scan.nextInt();

        System.out.print("Введите начальное число гаек: ");
        int k2 = scan.nextInt();
        System.out.print("Введите процент потерянных деталей: ");
        int l2 = scan.nextInt();
        System.out.print("Введите стоимость одной гайки: ");
        int m2 = scan.nextInt();

        System.out.printf("Потери составили: %d", k1 * (l1 / 100) * m1 + k2 * (l2 / 100) * m2);
    }
}
