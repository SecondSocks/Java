package learning1;

import java.lang.reflect.Type;

public class UniversalParameters {
    public static void main(String[] args) {
        Account<String, Integer> acc1 = new Account<>("2020", 40_000);
        String acc1ID = acc1.getId();
        System.out.println(acc1ID);

        Account<Integer, Integer> acc2 = new Account<>(2021, 50_000);
        int acc2ID = acc2.getId();
        System.out.println(acc2ID);
    }
}

class Account<Type, Type1> {
    private final Type id;
    private Type1 sum;

    public Account(Type id, Type1 sum) {
        this.id = id;
        this.sum = sum;
    }

    public Type getId() { return id; }
    public Type1 getSum() { return sum; }
    public void setSum(Type1 sum) { this.sum = sum; }
}
/*Generics Type класса Account помогает, если мы не знаем, какой тип данных будет лучше использовать, или получится так, что мы будем
 * использовать разные типы. Можно указывать несколько универсальных параметров*/

interface WorkAble<Type> {
    Type getName();
    int getAge();
}

class Worker implements WorkAble<String> {
    private final String name;
    private final int age;

    Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}
/*Для реализации универсального параметра интерфейса задается конкретный тип, тогда класс, реализующий интерфейс, жестко
* привязан к нему*/

interface PeopleAble<Type> {
    String getName();
    Type getAge();
}

class People<Type> implements PeopleAble<Type> {
    private final String name;
    private final Type age;

    People(String name, Type age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public Type getAge() { return age; }
}
/*Создается обобщенный класс, реализующий тот же универсальный параметр */