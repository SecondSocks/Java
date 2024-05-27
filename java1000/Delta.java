package java1000;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Delta {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите первую сторону треугольника: ");
        int a = scan.nextInt();
        System.out.print("Введите вторую сторону треугольника: ");
        int b = scan.nextInt();
        System.out.print("Введите третью сторону треугольника: ");
        int c = scan.nextInt();

        if(a+b > c && a+c > b && c+b > a) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
