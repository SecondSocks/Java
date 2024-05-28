package learning3;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class Exception1 {

    public static void main(String[] args) /*throws FileNotFoundException*/ {

        ArrayList<String> file1 = getFiles();
        if(file1.isEmpty()) {
            System.out.println("No Data Found");
        } else {
            for(int i = 1; i <= file1.size(); i++){
                System.out.printf("%d. %s\n", i, file1.get(i-1));
            }
        }
    }

    public static ArrayList<String> getFiles() {
        ArrayList<String> files = new ArrayList<>();
        String path = "learning3/text";

        try {
            File file = new File(path);  // Code block
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                files.add(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");  // Exception block
        }

        return files;
    }
}
