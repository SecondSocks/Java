/*On Demand Holder Idiom*/
package Patterns;

public class Singleton1 {
    public static class SingletonHolder {
        public static final Singleton1 HOLDER_INSTANCE = new Singleton1();
    }

    public static Singleton1 getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}
/*Используется всегда, когда нужна многопоточность и есть гарантия, что объект синглтон класса будет создан без проблем*/