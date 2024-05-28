package learning3;

import java.io.IOException;
import java.text.ParseException;

public class Exception4 {
    public static void main(String[] args) {
        try {
            run();
        } catch (IOException e) {
            System.out.println("Invalid input or output data");
        } catch (ParseException e) {
            System.out.println("Invalid parse data");
        }  // Можно обрабатывать несколько оишбок через try-catch, либо в сигнатуре метода

        // Multicatch Exception
        try {
            run();
        } catch (IOException | IllegalArgumentException | ParseException e) {
            System.out.println("Invalid input or output data");
        }

        // Можно обрабатывать исключения через родительский класс Exception
        try {
            run();
        } catch (Exception e) {
            System.out.println("Exception caught");
        } // В этом случае больше не получится обрабатывать какие-то исключения, т.к все обрабатывается через род. класс
    }

    public static void run() throws IOException, ParseException, IllegalArgumentException {}
}
