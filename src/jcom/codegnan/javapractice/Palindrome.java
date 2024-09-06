package jcom.codegnan.javapractice;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int number = sc.nextInt();
		int reversednumber =0;
		while(number!=0) {
			int remainder = number %10;
			reversednumber = reversednumber*10+remainder;
			number = number/10;
		}
		if(number == reversednumber) {
			System.out.println(number+"is a palindrome");	
		}
		else {
			System.out.println(number+"is  not a palindrome");	
			
		}
		// TODO Auto-generated method stub

	}

}
