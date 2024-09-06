package jcom.codegnan.javapractice;
import java.util.Scanner;


public class Ifonly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the  temperature");
		double temperature = sc.nextDouble();
		if (temperature > 30) {
			System.out.println("the temperature is hot");
		}
		if (temperature < 20) {
			System.out.println("the temperature is cool");
		}
		if (temperature <  10) {
			System.out.println("wear cotton clothes");
		}


	}

}
