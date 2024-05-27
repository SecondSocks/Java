package java1000;
import java.util.Scanner;


public class Keyboard {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String buttons = "qwertyuiopasdfghjklzxcvbnm";
        System.out.print("Введите букву: ");
        String button = scan.nextLine();

        int index = buttons.indexOf(button);

        if(index == 25) {
            System.out.println(buttons.charAt(0));
        } else {
            System.out.println(buttons.charAt(index+1));
        }
    }
}
