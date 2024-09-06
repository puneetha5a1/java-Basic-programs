package javaPracticePrograms;
import java.util.Scanner;

public class unaryoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a:  ");
		int a = sc. nextInt();
		System.out.println("enter the value of b:  ");
		int b = sc. nextInt();
		System.out.println("enter the result1:  ");
		int result1 = sc.nextInt();
		result1 = ++a;
		System.out.println("after increment:  "+result1);
		System.out.println("enter the result2:  ");
		int result2 = sc.nextInt();
		result2 = --b;
		System.out.println("after decrement:  "+result2);


	}

}
