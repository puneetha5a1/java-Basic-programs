package jcom.codegnan.javapractice;
import java.util.*;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int number = sc.nextInt();
		int result = 1;
		for(int i =1;i<=number;i++) {
			result = result*i;
		}
		System.out.println("the factorial of a "+number+" is "+result);
		

	}

}

