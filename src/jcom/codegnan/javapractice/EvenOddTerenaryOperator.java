package jcom.codegnan.javapractice;
import java.util.Scanner; 
public class EvenOddTerenaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		
		System.out.println("enter the number :");
		int number = scanner.nextInt();
		String result = number % 2 == 0 ? "even" : "odd";			
		System.out.println(result);


	}

}
