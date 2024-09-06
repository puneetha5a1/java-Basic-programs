package javaPracticePrograms;
import java.util.Scanner;
public class Logicaloperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num1:  ");
		int num1 = sc. nextInt();
		System.out.println("enter the num2:  ");
		int num2 = sc. nextInt();
		// and operator
		System.out.println((num1>num2)&&(num1>num2));
		System.out.println((num1>num2)&&(num1<num2));
		// or operator
		System.out.println((num1<num2)||(num1>num2));
		System.out.println((num1>num2)||(num1<num2));
		System.out.println((num1<num2)||(num1<num2));
		// ! operator
		System.out.println(!(num1==num2));
		System.out.println(!(num1>num2));

	}

}
