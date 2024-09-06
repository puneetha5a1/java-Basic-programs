package javaPracticePrograms;
import java.util.Scanner;
public class Stringconcatenationoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the text:  ");
		String text  = sc.next();
		System.out.println("enter the num1:  ");
		int num1 = sc. nextInt();
		System.out.println("enter the num2:  ");
		int num2 = sc. nextInt();
		System.out.println("enter the num3:  ");
		int num3 = sc. nextInt();
		System.out.println("You entered: " + text);
		System.out.println(text + num1 + num2 + num3); 
		 System.out.println(num1 + num2 + num3 + text); 
		 System.out.println(num1 + num2 + text + num3);
		 System.out.println(num1 + text + num2 + num3);

	}

}
