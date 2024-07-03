package learning3;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Exception2 {
    public static void main(String[] args) throws IOException, ScannerException /*Сигнатура метода*/ {
        /*
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int num = Integer.parseInt(scanner.nextLine());

            if(num != 0) {
                throw new IOException();  // Если происходит выброс исключения, то его нужно добавить в сигнатуру
            }
        }
        */
        test2();
    }

    private static void test() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int num = Integer.parseInt(scanner.nextLine());
            if(num != 0) {
                try {
                    throw new IOException();  // Либо обрабатывать исключения вручную, что предпочтительнее
                } catch (IOException e) {
                    System.out.println("Вы ввели неправльное значение");
                }
            }
        }
    }

    private static void test2() throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num != 0) {
                throw new ScannerException("User input others data");
            }
        }
    }
}
