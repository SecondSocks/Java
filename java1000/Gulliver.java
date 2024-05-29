package java1000;
import java.util.Scanner;


public class Gulliver {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите во сколько раз Гуливер больше лилипутов: ");
        int n = scan.nextInt();
        System.out.print("Введите количество слоев матрасов: ");
        int valueOfMatrasses = scan.nextInt();

        System.out.println(Math.pow(2, n) * valueOfMatrasses);
    }
}