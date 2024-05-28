package learning5;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject1 {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people1.bin"))) {  // Try with Resources
            // Мы создали поток до, поэтому внутри блок try прописывать считывание не нужно
            Person1 people1 = (Person1) ois.readObject();
            Person1 people2 = (Person1) ois.readObject();
            System.out.printf("%s\n%s\n", people1, people2);  // У каждого объекта id = 0, т.к сериализация этого поля запрещена

            //ois.close(); - так же мы можем убрать закрытие потока, т.к при завершении блока try, поток закрывается автоматически
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка десериализации");
        }

        System.out.println("Десериализация завершена");
    }
}
