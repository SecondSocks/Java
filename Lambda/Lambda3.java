package Lambda;

public class Lambda3 {
    private static void def(I i) {
        System.out.println(i.abc());
    }

    public static void main(String[] args) {
        def(() -> 18);
    }
}

interface I {
    int abc();
}

// Если сигнатура интерфейса не принимает никаких параметров, тогда и лямбда-выражение в левой части не содержит переменных