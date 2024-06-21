package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class StreamReduce {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(Math.toIntExact(Math.round(Math.random() * 10)));
        }

        int result = list.stream().reduce((accumulator, element) -> accumulator * element).get();
        // Мы создаем стрим из листа. Вызываем метод reduce, в котором создаем лямбда-выражение с 2 параметрами
        // accumulator и element. Параметру accumulator сразу присваивается значение элемента под индексом 0,
        // параметру element присваивается значение под индексом 1. Происходит умножение этих значений, и параметру
        // accumulator присваивается результат этого произведения. Потом параметру element присваиватеся следующий элемент,
        // и опять происходит умножение accumulator на element - так до тех пор, пока элементов в стриме не останется,
        // затем метод get() присваивает значение accumulator переменной result: это может быть int или null
        System.out.println(result);

        List<Integer> list100 = new ArrayList<>();
        try {
            int int100 = list100.stream().reduce((accumulator, element) -> accumulator*element).get();
        } catch (NoSuchElementException e) {
            System.out.println("Элементов нет. Метод get() не может передать значение null переменной типа int");
        }

        Optional<Integer> optional = list100.stream().reduce((accumulator, element) -> accumulator*element);
        if (optional.isPresent()) {  // isPresent() возвращает true, если в стриме есть элементы
            System.out.println(optional.get());
        } else {
            System.out.println("В листе нет элементов");
        }

        // Другой вариант использования метода reduce()
        int result2 = list.stream().reduce(1, (accumulator, element) -> accumulator*element);
        // В данном случае 1 - это первоначальное значение параметра accumulator. Следовательно, параметру element будут
        // присваиваться все значения листа по очереди. В таком случае использовать метод get() нет необходимости, так как
        // результат всегда будет int

        // Пример со строками
        List<String> list2 = new ArrayList<>();
        list2.add("Hello!"); list2.add("How are you?"); list2.add("Good bye!");
        String result3 = list2.stream().reduce((accumulator, element) -> accumulator + " " + element).get();
        System.out.println(result3);
    }
}
