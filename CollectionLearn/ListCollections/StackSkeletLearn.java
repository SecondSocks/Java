/*(Синхронизирован) Stack наследует Vector. Использует принцип LIFO (Last In First Out). Не рекомендуется использовать.*/
package CollectionLearn.ListCollections;

public class StackSkeletLearn {
    public static void main(String[] args) {  // Скелет стэка
        System.out.println("Main starts");
        abc3();
        System.out.println("Main ends");
    }

    public static void abc1() {
        System.out.println("abc1 starts");
        System.out.println("abc1 ends");
    }

    public static void abc2() {
        System.out.println("abc2 starts");
        abc1();
        System.out.println("abc2 ends");
    }

    public static void abc3() {
        System.out.println("abc3 starts");
        abc2();
        System.out.println("abc3 ends");
    }
}
