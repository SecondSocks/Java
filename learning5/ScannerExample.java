package learning5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        File file = new File("learning5/test.txt");
        Set<String> set = new TreeSet<>();
        Scanner scanner = null;

        try {
            scanner = new Scanner(new FileReader(file));
            scanner.useDelimiter("\\W");// Без знаков припинания

            while (scanner.hasNext()) {
                String word = scanner.next();
                set.add(word);
            }

            System.out.print("Used words: ");
            for (String word : set) {
                System.out.printf("%s, ", word);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File haven't been find");
        } finally {
            scanner.close();
        }
    }
}
