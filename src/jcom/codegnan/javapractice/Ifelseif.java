package jcom.codegnan.javapractice;
import java.util.Scanner;
public class Ifelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in); 
			System.out.println("Enter your city name :");
			String cityName = sc.next();
			if(cityName.equals("Hyderabad")) {
				System.out.println("Hello hyderabadi.. Adaab..");
			}
			else if (cityName.equals("Banglore")) {
				System.out.println("Hello kanadaki.. Namaskara");
				
			}
			else if (cityName.equals("chennai")) {
				System.out.println("Hello madrasi.. Vanakam");
				
			}
			else {
					System.out.println("plz enter the valid city Name");
			}


	}

}
