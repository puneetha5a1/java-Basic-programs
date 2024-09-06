package jcom.codegnan.javapractice;
import java.util.Scanner;
public class Oddnumberwhileloop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		 System.out.println("enter the number : ");
		 int number = sc.nextInt();
		 int i = 0;
		 while(i<number) {
			 System.out.println(i);
			 i= i+2;
		 }	

	}

}
