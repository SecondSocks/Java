package java1000;
import java.util.Scanner;


public class Strawberry {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите кол-во собранных ягод Машей: ");
        int x = scan.nextInt();
        System.out.print("Введите кол-во собранных ягод Мишей: ");
        int y = scan.nextInt();
        System.out.print("Введите кол-во съеденных ягод: ");
        int z = scan.nextInt();

        if (z > x+y) {
            System.out.println("impossible");
        } else {
            System.out.printf("%d", x+y-z);
        }
    }
}
