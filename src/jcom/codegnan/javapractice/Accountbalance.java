package jcom.codegnan.javapractice;
import java.util.Scanner;
public class Accountbalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter the amount to withdrawal : ");
		double accountbalance = 10000;
		double withdrawAmount = sc.nextDouble();
		if(withdrawAmount <= accountbalance) {
			accountbalance = accountbalance - withdrawAmount;
			System.out.println("withdrawAmount is success : " +withdrawAmount);
			System.out.println("remaining accountbalance :  "+accountbalance);	
		}
		else {
			System.out.println("insufficent funds");
			System.out.println("the accountbalance is :"+accountbalance);
		}  


	}

}
