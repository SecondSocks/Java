package java1000;
import java.util.Scanner;


public class TwoBandits {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите кол-во простреленных банок Гарри: ");
		int a = scan.nextInt();
		System.out.println("Введите кол-во простреленных банок Ларри: ");
		int b = scan.nextInt();
		
		System.out.printf("Гарри не прострелил %d банок, а Ларри %d", 10-a, 10-b);
	}
}