package jcom.codegnan.javapractice;

import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int number = sc.nextInt();
		int originalnumber =number;
		int sum = 0;
		int remainder;
		while(number!=0) {
			remainder =number%10;
			sum = sum+remainder;
			number = number/10;
			
		}
		System.out.println("the sum of digits in a given number "+ originalnumber+ " is : "+sum);

		// TODO Auto-generated method stub

	}

}
