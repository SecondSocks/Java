package learning5;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        // Запись объектов в файл people.bin
        Person person1 = new Person("John Doe", 22);
        Person person2 = new Person("Jane Doe", 20);

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person1);
            oos.writeObject(person2);

            oos.close();
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Запись массива объектов в файл peoples.bin
        Person[] peoples = {person1, person2, new Person("Garry Smith", 30), new Person("Bob Smith", 40)};

        try {
            FileOutputStream fos = new FileOutputStream("peoples.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(peoples.length);

            for (Person person : peoples) {
                oos.writeObject(person);
            }

            oos.close();
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Запись массива объектов как объект в файл peoples1.bin
        try {
            FileOutputStream fos = new FileOutputStream("peoples1.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(peoples);

            oos.close();
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Сериализация завершена");
    }
}
