package learning5;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        // Чтение объектов из файла people.bin
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person person1 = (Person) ois.readObject();  // Т.к передается объект типа Object - требуется сделать downcast
            Person person2 = (Person) ois.readObject();

            System.out.printf("%s\n%s\n", person1, person2);

            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println();

        // Чтение массива объектов из файла peoples.bin
        try {
            FileInputStream fis = new FileInputStream("peoples.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int arraySize = ois.readInt();
            Person[] peoples = new Person[arraySize];

            for (int i = 0; i < arraySize; i++) {
                peoples[i] = (Person) ois.readObject();
            }

            System.out.println(Arrays.toString(peoples));

            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println();

        // Чтение массива объектов как объекта из файла peoples1.bin
        try {
            FileInputStream fis = new FileInputStream("peoples1.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person[] peoples = (Person[]) ois.readObject();

            System.out.println(Arrays.toString(peoples));

            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Десериализация завершена");
    }
}
