package Lambda;

import java.util.function.*;
import java.util.Scanner;

public class LambdaInterfaces {
    public static void main(String[] args) {
        Predicate<Integer> condition = num -> (num > 0);  // Проверяет соблюдение некоторого условия
        BinaryOperator<Integer> multiply = (x, y) -> x*y;  // Выполняет бинарные операции
        UnaryOperator<Integer> square = x -> x*x;  // Выполняет операции над числами
        Function<Integer, String> convert = x -> x + " долларов";  // Функция перехода от одного объекта к другому
        Consumer<Integer> printer = x -> System.out.print("%d долларов\n");

        Supplier<User> userFactory = () -> {  // Ничего не принимает, но возвращает объект
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name = scanner.next();
            return new User(name);
        };

        System.out.println(condition.test(10));
        System.out.println(multiply.apply(10, 10));
        System.out.println(square.apply(10));
        System.out.println(convert.apply(100));
        printer.accept(800);

        User user1 = userFactory.get();
        User user2 = userFactory.get();

        System.out.println(user1);
        System.out.println(user2);
    }
}

class User {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    @Override
    public String toString() {
        return String.format("Name: %s", name);
    }
}