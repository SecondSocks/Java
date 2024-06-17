package Lambda;

public class Lambda2 {
    private static void def(MyInterface i) {
        System.out.println(i.abc("Parameter"));
    }

    public static void main(String[] args) {
        def((String s) -> { return s.length(); });
    }
}

interface MyInterface {
    int abc(String s);
}

/*В методе main мы вызываем метод def, который в параметрах принимает интерфейс MyInterface и выводит на экран какое-то
* действие со строкой, но это действие нам неизвестно, т.к. в интрейфейсе оно не определено. Поэтому в методе main мы
* вызываем метод def и передаем в него лямбда-выражение, которое описывает, что нужно сделать со строкой в методе def*/