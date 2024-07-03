package java1000;
import java.util.Scanner;

public class Spelling {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите номер символа, который нужно удалить: ");
        int numOfChar = scan.nextInt();

        System.out.print("Введите строку: ");
        String str = scan.next();
        StringBuilder string = new StringBuilder(str);

        System.out.println(string.deleteCharAt(numOfChar - 1));
    }
}
