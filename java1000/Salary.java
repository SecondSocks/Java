package java1000;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class Salary {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args){
		
		ArrayList<Integer> array = new ArrayList<>(3);
		array = addSalary(array);

		int minSalary = array.get(0);
		int maxSalary = array.get(0);
		for(int salary : array) {
			if(salary < minSalary) {
				minSalary = salary;
			} else if(salary > maxSalary) {
				maxSalary = salary;
			}
		}
		
		System.out.printf("Минимальная зарплата = %d\nМаксимальная зарплата = %d", minSalary, maxSalary);
	}
	
	private static ArrayList<Integer> addSalary(ArrayList<Integer> array) {
		
		System.out.println("Вводите зарплаты: ");
		for(int i = 0; i < 3; i++) {
			int salary = scan.nextInt();
			array.add(salary);
		}
		
		return array;
	}
}