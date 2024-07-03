package Streams;

import java.util.stream.Stream;

public class StreamConcat {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream2 = Stream.of(6, 7, 8, 9, 10);
        Stream<Integer> resStream = Stream.concat(stream1, stream2);  // Статический метод. Не может быть использован в цепи
        resStream.forEach(System.out::println);
    }
}
