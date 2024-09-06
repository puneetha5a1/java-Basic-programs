package jcom.codegnan.javapractice;
import java.util.*;
public class Evennumbersforloop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int number = sc.nextInt();
		for(int i=0;i<number;i=i+2) {
			System.out.println(i);
		}
	}

}


