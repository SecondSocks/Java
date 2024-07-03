package FilesIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStream {
    public static void main(String[] args) {
        String text = "Simple Text";

        read();
    }

    private static void write(String text) {
        try (FileOutputStream fos = new FileOutputStream("test.txt"/*, true*/)) {  // true - данные дозаписываются; false - файл перезаписывается
            byte[] buffer = text.getBytes();  // Превращаем текст в массив байтов

            fos.write(buffer, 0, buffer.length);  // Передается массив байтов, указываются рамки записи с 0 по последний байт
            System.out.println("File has been written");
        } catch (IOException e) {
            System.out.println("File hasn't been written");
        }
        // При помощи конструкции try..catch поток автоматически закрывается
    }

    private static void read() {
        try (FileInputStream fis = new FileInputStream("test.txt")) {
            int i;
            while((i = fis.read()) != -1) {  // Создается цикл, в котором в i передается каждый байт.
                // Если передавать нечего, тогда передается -1 и цикл завершается
                System.out.print((char) i); // Каждый байт преобразуется в символ
            }
        } catch (IOException e) {
            System.out.println("Error, when file try reading");
        }
    }

    private static void readAndClose() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("test.txt");

            int i = -1;
            while((i = fis.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (IOException e) {
            System.out.println("File not found");
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                System.out.println("Stream can't be close");
            }
        }
    }
}
