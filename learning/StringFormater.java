package learning;

public class StringFormater {
    
    public static void main(String[] args) {
        
        // Форматирование
        System.out.printf("This is string: %s"); 
        /* s - string
         * d - digit
         * 10d - digit: width 10 symbols before number "This is string: ______3790"
         * -10d - digit: width 10 symbols after number "This is string: 3790______"
         * f - float digit "This is string: 3.145657893"
         * .2f - float digit: 2 numbers after dot "This is string: 3.14"
         */

         // Сравнивание
         String str1 = "Hello";
         String str2 = "hello";

         if(str1.equals(str2)) {
            System.out.println("Строки сравнивались с учетом регистра");
         } else if(str1.equalsIgnoreCase(str2)) {
            System.out.println("Строки сравнивались без учета регистра");
         } else {
            System.out.println("Что-то не пойму");
         }

         // Перевод в строку
         String a = String.valueOf(12);
         String b = String.valueOf(true);
         String c = String.valueOf(3.14);
         String d = String.valueOf(3.1455F);
         System.out.printf("%s\n%s\n%s\n%s\n", a, b, c, d);  // Перевести можно только примитивные типы

         // Перевод строки в число 
         Integer i = Integer.parseInt("12");
         Double dub = Double.parseDouble("3.15");
         Float fl = Float.parseFloat("333.333F");
         System.out.printf("%d\n%d\n%d\n", i, dub, fl);
         
         // Разбиение строки
         String text = "Philip J. Fry; Turanga Leela; Bender Bending Rodriguez; Hubert Farnsworth";
         String[] textArray = text.split("; ");

         for(String el : textArray) {
            System.out.print(el);
         }

         // Индекс элемента
         String str = "This is simple string";
         System.out.printf("\nПервый символ строки: %s. Последний символ строки: %s\n", str.indexOf(0), str.indexOf("g"));
         System.out.println(str.lastIndexOf("s"));
         System.out.println(str.indexOf("i", 15));

         // Извлечение подстроки из строки
         String filePath = "D:\\Movies\\Futurama.mp4";
         int lastFileSeparatorIndex = filePath.lastIndexOf('\\');
         String fileName = filePath.substring(lastFileSeparatorIndex + 1);
         System.out.println(fileName);

         // Изменение регистра
         String z = "Very Simple String";
         System.out.println(z.toUpperCase());
         System.out.println(z.toLowerCase());

         /* Используются при работе со строками, которые редко будут модифицироваться */
    }
}
