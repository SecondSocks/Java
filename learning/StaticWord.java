package learning;

public class StaticWord {
    
    public static void main(String[] args) {
        
        Humn.getDescription(); // Работает без создания объекта класса Human
        Humn bob = new Humn("bob", 18);

        bob.getDescription(); // Это не является ошибкой, но и не является правильным подходом
        // Статические объекты - это объекты класса, поэтмоу их нужно вызывать через название класса
        bob.printNumberOfPeople();

        Humn tom = new Humn("Tom", 20);
        tom.printNumberOfPeople();
    }
}

class Humn {
    
    private String name;
    private int age;
    private static int countPeople;

    private static  String description = "Этот класс является описанием человека";

    public Humn(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void printNumberOfPeople() {
        System.out.println(countPeople);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void getDescription() {
        System.out.println(description);
    }

    /*
     * public static void printAllFields() {
     *      System.out.println(name)   !!! Ошибка. 
     * Не статические переменные нельзя использовать в статических методах
     * }
     * 
     * Не статические поля- это переменные для какого-то объекта
     * А статические поля - это переменные для всех объектов
     */

     /* Статические поля существуют сразу, как только запускается программа, им сразу присваивается значение
      * Нестатические поля существуют с момента создания объекта класса, только в этот момент им присваивается значение
      */

    /* Статические методы очень полезны, ведь мы можем использовать методы, не создавая объекты */

    /* Так же static необходимо использовать с константами полей, так как в ином случае будет происходить растрата памяти,
     * потому что переменная будет копироваться для каждого объекта, а не будет одной для всех
     */
}