package jcom.codegnan.javapractice;
import java.util.Scanner;

public class Oddnumbersforloop {

	public static void main(String[] args) {
			 Scanner sc = new Scanner(System.in); 
			 System.out.println("enter the number : ");
			 int number = sc.nextInt();
			 for(int i = 1;i<number;i=i+2) {  //for(int i = 1;i<number;i=i+2)(printing odd numbers)
				 System.out.println(i);
			 }


	}

}

