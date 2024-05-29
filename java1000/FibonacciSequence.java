package java1000;
import java.util.Scanner;
import java.util.ArrayList;


public class FibonacciSequence {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите n: ");
        int n = scan.nextInt();
        System.out.print("Введите элемент последовательности равный n: ");
        int an = scan.nextInt();
        System.out.print("Введите элемент последовательности равный n+1: ");
        int an1 = scan.nextInt();

        ArrayList<Integer> array = new ArrayList<>();
        array = getElements(array, an1, an);

        for(int i = 0; array.size() != n+1; i++) {
            array.add(array.get(i) - array.get(i+1));
        }

        System.out.println("Последовательность Фибоначчи: ");
        for(int k : array) {
            System.out.printf("%d ", k);
        }

        System.out.printf("\nПоследние два элемента последовательности: %d, %d", array.getLast(),
                                                                    array.get(array.lastIndexOf(array.getLast()) - 1));
  }

    private static ArrayList<Integer> getElements(ArrayList<Integer> array,int an1, int an) {
        array.add(an1);
        array.add(an);

        return array;
    }
}
