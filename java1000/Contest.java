package java1000;
import java.util.Scanner;
import java.util.ArrayList;


public class Contest {
    
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Введите кол-во задач: ");
        int valueOfTask = scan.nextInt();

        ArrayList<Integer> firstCourse = new ArrayList<>(valueOfTask);
        ArrayList<Integer> thirdCourse = new ArrayList<>(valueOfTask);
        ArrayList<Integer> fifthCourse = new ArrayList<>(valueOfTask);

        System.out.println("Введите штрафные минуты для первокурсника: ");
        firstCourse = addMinutes(firstCourse, valueOfTask);

        System.out.println("Введите штрафные минуты для третикурсника: ");
        thirdCourse = addMinutes(thirdCourse, valueOfTask);

        System.out.println("Введите штрафные минуты для пятикурсника: ");
        fifthCourse = addMinutes(fifthCourse, valueOfTask);

        int sumFirstCourse = sumOfMinutes(firstCourse);
        int sumThirdCourse = sumOfMinutes(thirdCourse);
        int sumFifthCourse = sumOfMinutes(fifthCourse);

        if(sumFifthCourse < sumFirstCourse && sumFifthCourse < sumThirdCourse) {
            System.out.println("Победил пятикурсник");
        } else if(sumFifthCourse < sumFirstCourse && sumThirdCourse < sumFifthCourse) {
            System.out.println("Победил третикурсник");
        } else if(sumFirstCourse < sumFifthCourse && sumFirstCourse < sumThirdCourse) {
            System.out.println("Победил первокурсник");
        } else if(sumFirstCourse == sumThirdCourse && sumFifthCourse > sumFirstCourse) {
            System.out.println("Победил первокурсник");
        } else if(sumFirstCourse == sumFifthCourse && sumFifthCourse < sumThirdCourse) {
            System.out.println("Победил первокурсник");
        } else if(sumThirdCourse == sumFifthCourse && sumThirdCourse < sumFirstCourse) {
            System.out.println("Победил третикурсник");
        }
    }

    private static ArrayList<Integer> addMinutes(ArrayList<Integer> array, int taskValue) {

        int i = 0;
        while(i < taskValue) {
            int minute = scan.nextInt();
            array.add(minute);
            i++;
        }

        return array;
    }

    private static int sumOfMinutes(ArrayList<Integer> array) {

        int result = 0;
        for(int i : array) {
            result = result + i;
        }

        return result;
    }
}
