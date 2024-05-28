package learning3;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Exception3 {
    public static void main(String[] args) {
        // Checked Exception (Compile time exception) - исключительные случаи в работе программы
        String path = "learning3/text";
        File file = new File(path);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");;
        }

        // Unchecked Exception (Runtime exception) - ошибка в работе программы
        // int x = 1 / 0; - ArithmeticException()
        /* String name = null;
            name.length(); - NullPointerException()*/
        /* int[] arr = new int[2];
        arr[2] - ArrayIndexOutOfBoundsException()
         */
        try {
            int x = 1 / 0;
        } catch (RuntimeException e) {
            System.out.println("Runtime exception");
        }
    }
}
