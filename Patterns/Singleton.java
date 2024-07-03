/*Double Checked Lock & Volatile*/
package Patterns;

public class Singleton {
    private static volatile Singleton instance;

    public static Singleton getInstance() {
        Singleton localInstance = instance;
        if (localInstance == null) {
            synchronized (Singleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new Singleton();
                }
            }
        }
        return localInstance;
    }
}
/*Используется в редких случаях, когда нужно обрабатывать исключения при создании синглтона. (когда неприменим Class Holder Singleton)*/