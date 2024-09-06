package jcom.codegnan.javapractice;
import java.util.*;

public class PositiveNegativeTerneryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number: ");
		int number = scanner.nextInt();
		String result = (number > 0) ? "positive" : "negative";			
		System.out.println(result);

	}

}
