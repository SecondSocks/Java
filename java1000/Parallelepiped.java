package java1000;
import java.util.Scanner;


public class Parallelepiped {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длину: ");
        int a = scan.nextInt();
        System.out.print("Введите ширину: ");
        int b = scan.nextInt();
        System.out.print("Введите высоту: ");
        int c = scan.nextInt();

        System.out.printf("Площадь параллелепиппеда = %d\n", 2*a*b + 2*a*c + 2*b*c);
        System.out.printf("Объем параллелепиппеда = %d", a*b*c);
    }
}
