package learning2;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class FileReading {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);  // System.in - константа, в которой находится стандартный поток ввода

        /* String separator = File.separator;
        String filePath = "C:" + separator + "Java" + separator + "learning" + separator + "test.txt"; */

        File file = new File("C:\\Java\\learning2\\test.txt");
        Scanner scanner = new Scanner(file);

        ArrayList<String> strings = new ArrayList<>();

        while(scanner.hasNextLine()) {
            strings.add(scanner.nextLine());
        }

        System.out.println(strings);

        File file1 = new File("C:\\Java\\learning2\\test1");
        scanner = new Scanner(file1);

        String line = scanner.nextLine();
        String[] numbers = line.split(" ");

        int[] nums = new int[numbers.length];
        int counter = 0;
        for(String num : numbers) {
            nums[counter++] = Integer.parseInt(num);
        }

        System.out.println(Arrays.toString(nums));

        scanner.close();
    }
}
