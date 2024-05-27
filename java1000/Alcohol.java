package java1000;
import java.util.Scanner;

public class Alcohol {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите кол-во атомов углерода: ");
        int c = scan.nextInt();
        System.out.print("Введите кол-во атомов водорода: ");
        int h = scan.nextInt();
        System.out.print("Введите кол-во атомов кислорода: ");
        int o = scan.nextInt();
        int[] formula = {2, 6, 1};

        if(c < formula[0] || h < formula[1] || o < formula[2]) {
            System.out.println(0);
        } else if(formula[0] % 2 != 0 || formula[1] % 6 != 0 || formula[2] % 1 != 0){
            System.out.println(0);
        } else {
            System.out.println(o);
        }
    }
}
