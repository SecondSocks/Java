package learning5;

import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class WriteToFile {
    public static void main(String[] args) {
        String path = "learning5/text";
        File file = new File(path);
        try {
            PrintWriter writer = new PrintWriter(file);
            writer.println("Hello World");
            writer.println(12);
            writer.println(true);
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
