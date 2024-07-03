package learning4;

public class Electrocar {
    private final int id;

    // Нестатический вложенный класс
    private class Engine {
        public void startEngine() {
            System.out.printf("Engine %d is starting.\n", id);
        }
    }
    /* Нестатические вложенные классы нужны, т.к класс Electrocar сам по себе очень сложен, и если прописывать
    * все в одном классе, то получится очень тяжелый код, а при помози нестат. вл. кл. мы разграничиваем логику.
    * Модификатор private нужен, так как вл. кл. служит классу Electrocar*/

    // Статический вложенный класс
    public static class Battery {
        public void charge() {
            System.out.println("Battery charging...");
        }
    }
    /* Статические вложенные классы очень отличаются от нестатю вл. кл.. Во-первых, они не имеют доступа к полям класса.
    * Они создаются, чтобы сгруппировать 2 класса вместе. Ст. вл. кл. имеет доступ ко всем статическим полям и методам
    * класса, в котором он находится*/

    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        Engine engine = new Engine();
        engine.startEngine();

        final int x = 1;
        // Вложенный в метод класс
        class SomeClass {
            public void someMethod() {
                System.out.printf("%d %d", x, id);
            }
        }
        /* Этот вложенный класс имеет доступ к нестат. полям, методам класса, в котором лежит. Также вл. в метод кл.
        * имеет доступ к переменным внутри метода, в котором лежит, но эти переменные обязательно должны быть конст.
        * Вл. в метод кл. очень похожи на анониманые классы  */
        SomeClass someObject = new SomeClass();

        System.out.printf("Electrocar %d is starting.\n", id);
    }
}
