package jcom.codegnan.javapractice;
import java.util.Scanner;
public class Countthenumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int number = sc.nextInt();
		int count = 0;
		while(number!=0) {
			number =number/10;
			count++;
		}
		System.out.println("the number of digits in a given number is : "+count);

		// TODO Auto-generated method stub

	}

}
