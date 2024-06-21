package Streams;

import java.util.Arrays;

public class StreamForEach {
    public static void main(String[] args) {
        int[] array = {1, 5, 20, 201, 5, 3, 9, 19};
        Arrays.stream(array).forEach(element -> {
            element *= element;
            System.out.println(element);
        });  // Метод forEach помогает сократить код и не преобразовывать стрим в коллекцию или массив
        Arrays.stream(array).forEach(System.out::println);  // Таким образом мы выводим все на экран
        // Этот метод называетсяы референс. Мы пишем ссылку на метод, и метод forEach выполняет действие с каждым элементтом
        Arrays.stream(array).forEach(Utils::squaring);  // Мы указали ссылку на метод squaring в классе Utils
        // Utils::squaring == el -> Utils.squaring(el)
    }
}

class Utils {
    public static void squaring(int element) {
        element *= element;
        System.out.println(element);
    }
}
