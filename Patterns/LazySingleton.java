/*Lazy Initialization*/
package Patterns;

public class LazySingleton {
    private static LazySingleton instance;  // Добавляем в класс приватное статическое поле, содержащее одиночный объект

    private LazySingleton() {}  // Создаем приватный конструктор класс, чтобы он не мог возвращать новые объекты

    public static LazySingleton getInstance() {  // Создаем статический создающий метод, которой будет возвращать Singleton
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
/*Используется всегда, когда не нужна многопоточность*/