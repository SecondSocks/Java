package java1000;
import java.util.Scanner;


public class Nutles {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите количесвто собранных шишек: ");
        int n = scan.nextInt();
        System.out.print("Введите количество орешек в шишке: ");
        int m = scan.nextInt();
        System.out.print("Введите необходимое на зиму количество орешек: ");
        int k = scan.nextInt();

        if((n*m) < k) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
