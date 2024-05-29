package java1000;
import java.util.Scanner;
import java.util.ArrayList;

public class Basketball {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Integer> firstGame = new ArrayList<>(2);
        ArrayList<Integer> secondGame = new ArrayList<>(2);
        ArrayList<Integer> thirdGame = new ArrayList<>(2);
        ArrayList<Integer> fourthGame = new ArrayList<>(2);

        firstGame = getScore(firstGame);
        secondGame = getScore(secondGame);
        thirdGame = getScore(thirdGame);
        fourthGame = getScore(fourthGame);

        int finalScoreFirst = 0;
        int finalScoreSecond = 0;

        finalScoreFirst = finalScoreFirst + firstGame.get(0) + secondGame.get(0) + thirdGame.get(0) + fourthGame.get(0);
        finalScoreSecond = finalScoreSecond + firstGame.get(1) + secondGame.get(1) + thirdGame.get(1) + fourthGame.get(1);

        if(finalScoreFirst > finalScoreSecond) {
            System.out.println("1");
        } else if(finalScoreSecond > finalScoreFirst) {
            System.out.println("2");
        } else {
            System.out.println("DRAW");
        }
    }

    private static ArrayList<Integer> getScore(ArrayList<Integer> array) {

        System.out.print("Введите счет: ");
        for(int i = 0; i < 2; i++) {
            int num = scan.nextInt();
            array.add(num);
        }
        return array;
    }
}
