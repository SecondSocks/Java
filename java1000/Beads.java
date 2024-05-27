package java1000;
import java.util.Scanner;


public class Beads {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите кол-во цветов: ");
        int colors = scan.nextInt();
        System.out.println(colors + 1);
    }
}
