package learning;

public class LearnStringBuffer {

    public static void main(String[] args) {

        System.out.println("We add: " + 1 + " " + false + " " + 3.14);

        // Удаление подстроки
        StringBuffer str = new StringBuffer("Simple String");
        int lastSymbolS = str.lastIndexOf("S");
        System.out.println(str.delete(lastSymbolS, -1));

        // Удаление символа
        StringBuffer s = new StringBuffer("I create string");
        int index = s.indexOf("I");
        System.out.println(s.deleteCharAt(index));

        // Вставить строку в позицию
        StringBuffer a = new StringBuffer("I w create string");
        index = a.indexOf("w");
        System.out.println(a.insert(index+1, "ant"));

        // Заменить все символы в пределах 
        StringBuffer code = new StringBuffer("ABCD___H...");
        String replacingString = "EFG";
        int startIndex = code.indexOf("C");
        int lastIndex = code.indexOf("H");
        System.out.println(code.replace(startIndex+1, lastIndex, replacingString));

        // Перевернуть строку
        System.out.println(code.reverse());

        // Так же, как и у String, можно возвращать подстроку

        /* Используется при работе со строками, которые часто будут модифицироваться в многопоточной среде */
    }
}
