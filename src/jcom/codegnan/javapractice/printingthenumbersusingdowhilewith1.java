package jcom.codegnan.javapractice;
import java.util.Scanner;

public class printingthenumbersusingdowhilewith1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		 System.out.println("enter the number : ");
		 int number = sc.nextInt();
		 int i = 1;
		 do {
			 System.out.println(i);
			 i=i+2;
		 }
		 while (i<=number);
		 
		 }


	}


