package java1000;
import java.util.Scanner;


public class Game {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int firstNumber = scan.nextInt();
        int lastNumber = 9 - firstNumber;
        System.out.println(firstNumber + "9" + lastNumber);
    }
}
