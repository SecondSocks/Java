package learning;

public class LearnStringBuilder {
    
    public static void main(String[] args) {
        
        String s = "ПриВет!";  // Класс String - неизменяемый
        s.toUpperCase();  // Этот метод возращает новую строку, а не изменяет старую
        System.out.println(s); // ПриВет!

        s = s.toUpperCase(); // Переназначаем переменную, а не изменяем строку
        System.out.println(s);  // ПРИВЕТ!

        String str1 = "Hello ";
        String str2 = "world!";
        String str = str1 + str2; /*  В данном случае при каждой конкантенации создается новый объект,
        что увеличивает время работы программы */
    }

    private void anotherStringFormat() {

        StringBuilder strBuilder = new StringBuilder("Hello"); // В скобочках ставится начальное значение строки
        System.out.println(strBuilder); // Hello
        strBuilder.append(" world!"); /* Та же самая конкантенация,
         только новые объекты не создаются? из-за чего программа тратит меньше времени */ 
        System.out.println(strBuilder);

        System.out.println("This is" + " chain-" + "method");

        /* Все методы как и у StringBuffer */
        /* Используется при работе со строками, которые часто будут модифицироваться, в однопоточной среде */
    }
}
