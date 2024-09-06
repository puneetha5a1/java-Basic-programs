package jcom.codegnan.javapractice;
import java.util.Scanner;

public class EqualsIgnoreCase {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in); 
			System.out.println("Enter your city name :");
			String cityName = sc.next();
			if(cityName.equalsIgnoreCase("Hyderabad")) {
				System.out.println("Hello hyderabadi.. Adaab..");
			}
			else if (cityName.equalsIgnoreCase("Banglore")) {
				System.out.println("Hello kanadaki.. Namaskara");
				
			}
			else if (cityName.equalsIgnoreCase("chennai")) {
				System.out.println("Hello madrasi.. Vanakam");
				
			}
			else {
					System.out.println("plz enter the valid city Name");
			}
			}


}
