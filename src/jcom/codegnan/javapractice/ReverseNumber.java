package jcom.codegnan.javapractice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ener the number: ");
		int number = sc.nextInt();
		int reversednumber = 0;
		while(number!=0) {
			int remainder = number % 10;
			reversednumber = reversednumber*10+remainder;
			number = number/10;
			
		}
		System.out.println("the reversed number is : "+reversednumber);
		
		// TODO Auto-generated method stub

	}
	

}
