package java1000;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Office {
    public static void main(String[] args) {
        String filePath = "java1000/OfficeTask";
        File file = new File(filePath);
        try {
            Scanner scanner = new Scanner(file);
            int[] peoples = new int[31];
            int i = 0;
            while (scanner.hasNextLine()) {
                peoples[i] = scanner.nextInt();
                i++;
            }
            int worker = 0;
            for (int j = 0; j < peoples.length-4; j++) {
                worker += peoples[j];
            }
            System.out.println(worker / (peoples.length-4));

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
