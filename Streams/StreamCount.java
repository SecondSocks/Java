package Streams;

import java.util.stream.Stream;

public class StreamCount {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        long streamLength = stream.count();
        System.out.printf("Stream length = %d\n", streamLength);

        //long valueOfUnicElements = stream.distinct().count();  - ОШИБКА! Stream нельзя переиспользовать
        Stream<Integer> newStream = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        long valueOfUnicElements = newStream.distinct().count();
        System.out.printf("Value of unique elements: %d", valueOfUnicElements);
    }
}
