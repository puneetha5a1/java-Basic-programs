package jcom.codegnan.javapractice;
import java.util.Scanner;


public class dowhileswitch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int choice;
		System.out.println("hey customer look at the menu: ");
		System.out.println("1. biryani");
		System.out.println("2. panner butter masala  with roti");
		System.out.println("3. apollo fish with nann");
		System.out.println("4.plain rice");
		System.out.println("5.family pack chicken biryani");
		System.out.println("6.exit");
		do {
			System.out.println("enter your choice 1 to 6 ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("hey customer your order biryani is here .. enjoy the dish");
				break;
			case 2:
				System.out.println("hey customer your order panner butter masala with roti is here .. enjoy the dish");
				break;
			case 3:
				System.out.println("hey customer your order apollo fish with nann is here .. enjoy the dish");
				break;
			case 4:
				System.out.println("hey customer your order plain rice is here .. enjoy the dish");
				break;
			case 5:
				System.out.println("hey customer your order family pack chicken biryani is here .. enjoy the dish");
				break;
			case 6:
				System.out.println("hey customer ! thank you for visiting our hotel and placing order... we wish you had a great service...");
				break;
			default:
				System.out.println("Invalid choice .. please enter the correct choice");
				break;
			}
			System.out.println();
		}
		while(choice !=6);			

	}

}
