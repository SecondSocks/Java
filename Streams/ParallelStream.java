package Streams;

import java.util.List;
import java.util.ArrayList;

public class ParallelStream {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        double sumResult = list.parallelStream()
                .reduce((accumulator, element) -> accumulator+element)
                .get();
        System.out.printf("Result: %.2f\n", sumResult);

        double divisionResult = list.stream()
                .reduce((accumulator, element) -> accumulator/element)
                .   get();
        System.out.printf("Result: %.2f\n", divisionResult);
    }
}
/*Parallel Stream нужно использовать тогда, когда нам нужно
* выполнить агрегированную функцию: min, max, sum - и
* абсолютно не подходит, когда действия над элементами
* напрямую зависит от их очередность. Параллельность
* нужно использовать тогда, когда у вас очень много
* элементов*/