package java1000;
import java.util.Scanner;


public class ConverseToNumSys {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num10 = scan.nextInt();
        System.out.print("Введите систему счисления: ");
        int numberSystem = scan.nextInt();

        String numberInSystem = getBinaryNum(num10, numberSystem);

        System.out.println(numberInSystem);

    }

    public static String getBinaryNum(int num, int bin) {

        StringBuilder str = new StringBuilder();
        while(num >= bin) {
            str.append(num % bin);
            num = num / bin;
        }
        str.append(num);

        return String.valueOf(str.reverse());
    }
}
