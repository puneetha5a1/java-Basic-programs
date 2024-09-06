package jcom.codegnan.javapractice;
import java.util.*;
public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int number = sc.nextInt();
		int armstrongnumber=0;
		int temp;
		temp = number;

		while(number>0) {
			int remainder = number %10;
			armstrongnumber += remainder*remainder*remainder;
			number = number/10;					
		}
		if(temp == armstrongnumber) {
			System.out.println(temp+ "is an armstrongnumber");	
		}
		else {
			System.out.println(temp+ "is not an armstrongnumber");
		}
	}
}
