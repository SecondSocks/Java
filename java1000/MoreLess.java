package java1000;
import java.util.Scanner;


public class MoreLess {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNumber = scan.nextInt();

        System.out.print("Введите второе число: ");
        int secondNumber = scan.nextInt();

        if(firstNumber > secondNumber) {
            System.out.println(">");
        } else if(secondNumber > firstNumber) {
            System.out.println("<");
        } else {
            System.out.println("=");
        }
    }
}
