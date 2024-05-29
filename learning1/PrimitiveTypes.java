package learning1;

import java.util.Arrays;

public class PrimitiveTypes {

	public static void main(String[] args) {

		int a = 123;
		long b = a;  // Неявное приведение
		long c = 229L;
		//int x = c - Ошибка!
		int x = (int) c;  // Явное приведение
		double d = a;
		d = 122.55;
		float s = (float) d;
		int f = (int) d;
		long l = Math.round(3.14);
		// Окргуление до целого числа таким образом окргуляет и приводит к типу long
		byte b1 = (byte) 128;  // Размер -128 - 127
		System.out.println(b1);  // -128, так как превысили лимит
	}

	public static void wrapper() {
		// У примитивных типов данных нет методов
		// Но если требуется выполнить какое-то действие с ними, то используются обертки
		Integer x = 123;  // Эта инициализация = Integer x = new Integer(123);
		// В данном случае происходит автоупаковка
		int y = x; // Тут работает автораспаковка

	}
}