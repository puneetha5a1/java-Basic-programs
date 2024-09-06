package javaPracticePrograms;
import java.util.Scanner;

public class Comparisionoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num1:  ");
		int num1 = sc. nextInt();
		System.out.println("enter the num2:  ");
		int num2 = sc. nextInt();
		boolean isEqual = (num1 == num2);
        System.out.println("num1 is equal to num2: " + isEqual);
        boolean isNotEqual = (num1 != num2);
        System.out.println("num1 is not equal to num2: " + isNotEqual);
        boolean isGreaterThan = (num1 > num2);
        System.out.println("num1 is greater than num2: " + isGreaterThan);
        boolean isLessThan = (num1 < num2);
        System.out.println("num1 is less than num2: " + isLessThan);
        boolean isGreaterThanOrEqual = (num1 >= num2);
        System.out.println("num1 is greater than or equal to num2: " + isGreaterThanOrEqual);
        boolean isLessThanOrEqual = (num1 <= num2);
        System.out.println("num1 is less than or equal to num2: " + isLessThanOrEqual);

	}

}
