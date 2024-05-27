package java1000;
import java.util.Scanner;


public class Palindrome {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        String num = scan.nextLine();
        StringBuilder palindrome = new StringBuilder(num);
        StringBuilder palindromeReverse = new StringBuilder(num);
        palindromeReverse.reverse();

        if(palindrome.equals(palindromeReverse)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
