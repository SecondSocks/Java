package learning5;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

public class WriteObject1 {
    public static void main(String[] args) {
        Person1 people1 = new Person1("John Doe", 1);
        Person1 people2 = new Person1("Jane Doe", 2);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people1.bin"))) {  // Try with Resources
            oos.writeObject(people1);
            oos.writeObject(people2);
        } catch (IOException e) {
            System.out.println("Ошибка сериализации");
        }

        System.out.println("Сериализация завершена");
    }
}
