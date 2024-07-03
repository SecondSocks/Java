package FilesIO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayIOStream {
    public static void main(String[] args) {

    }

    private static void read() {
        byte[] array = {40, 20, 22, 15, 10, 31};
        ByteArrayInputStream byteStream = new ByteArrayInputStream(array);
        int b;
        while ((b = byteStream.read()) != -1) {
            System.out.println(b);
        }

        String text = "This text will be transform to bytes";
        byte[] array1 = text.getBytes();
        ByteArrayInputStream byteStream1 = new ByteArrayInputStream(array1, 0, 10);  // (массив, смещение с начала, длина)
        int i;
        while ((i = byteStream1.read()) != -1) {
            System.out.println((char) i);
        }
    }

    private static void write() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String text = "This line will be transform to byte array";
        byte[] buffer = text.getBytes();

        try {
            baos.write(buffer);
        } catch (IOException e) {
            System.out.println("Line can't be written");
        }

        System.out.println(baos);
        byte[] array = baos.toByteArray();
        for (byte b : array) {
            System.out.println((char) b);
        }

        try {
            baos.close();
        } catch (IOException e) {
            System.out.println("Stream can't be close");
        }
    }

    private static void writeToFile() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String text = "Simple text";
        byte[] buffer = text.getBytes();

        try {
            baos.write(buffer);
        } catch (IOException e) {
            System.out.println("Text can't be written");
        }

        try (FileOutputStream fos = new FileOutputStream("test1.txt")) {
            baos.writeTo(fos);
        } catch (IOException e) {
            System.out.println("File not found");
        } finally {
            try {
                baos.close();
            } catch (IOException e) {
                System.out.println("Stream can't be close");
            }
        }
    }
}
