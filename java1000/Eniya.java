package java1000;
import java.util.Scanner;


public class Eniya {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите кол-во панелей: ");
        int n = scan.nextInt();
        System.out.print("Введите длину: ");
        int a = scan.nextInt();
        System.out.print("Введите ширину: ");
        int b = scan.nextInt();

        System.out.println(n*a*b*2);
    }
}
