package jcom.codegnan.javapractice;

import java.util.Scanner;

public class Evennumberusingforandif {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int i;
		int number = sc.nextInt();
		for(i=1;i<=number;i++) {
			if(i %2!=0) {
				continue;
			}
				System.out.println(i);
			
				
				
			}
		}
		// TODO Auto-generated method stub

	}



