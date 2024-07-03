package Streams;

import java.util.stream.Stream;

public class StreamPeek {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        System.out.println(stream.distinct().peek(System.out::println).count());  // Метод peek() может просмотреть поток
        // В данном коде мы отфильтровали элементы по уникальности, затем метод peek() элементы получившегося потока,
        // потом метод count() вывел кол-во элементов в итоговом потоке
    }
}
