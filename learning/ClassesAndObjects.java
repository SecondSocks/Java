package learning;

public class ClassesAndObjects {
    
    public static void main(String[] args) {  // psvm = public static void main(String[] args)
        
        People roman = new People();
        roman.sayAge();
        roman.sayName();

        roman.setAge(19);
        roman.setName("Роман");

        int romanAge = roman.getAge();
        String romanName = roman.getName();

        System.out.printf("\nИмя: %s\nВозраст: %s\n", romanName, romanAge);

        roman.setAge(20);
        roman.setName("Михаил");

        System.out.printf("Был %s, а стал %s, возраст: %s", romanName, roman.getName(), roman.getAge());
    }
}

class People {

    private String name;
    private int age;

    {
        name = "undefined";  // Конструктор
        age = 18;
    }

    void sayName() {
        System.out.printf("My name is %s\n", this.name);
    }

    void sayAge() {
        System.out.printf("I %s years old\n", this.age);
    }

    /*Блок сеттеров и геттеров */
    public String getName() {
        return name; 
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;  // В данном случае хорошо видно, что этот.name = name, т.е объект внутри класса = переданное значение
    }

    public void setAge(int age) {
        this.age = age; // this. - это означает, что объект именно этого клааса
    }

    /* В данном коде используется инкапсуляция: поля имеют метод private, чтобы никто не мог их изменять вне калсса,
     * присутствуют сеттеры и геттеры, которые работают с данными полями
     * this в основном используется совместно с сеттерами
     */
}

