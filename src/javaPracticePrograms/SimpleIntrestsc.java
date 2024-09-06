package javaPracticePrograms;
import java.util.Scanner;
public class SimpleIntrestsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the principle amount: ");
		float principle = sc. nextFloat();
		System.out.println("enter the time: ");
	        float time  =  sc.nextFloat();
		System.out.println("enter the rate : ");
		float rate  = sc. nextFloat();
		double si = (principle*time*rate)/100;
		System.out.println("the compound  intrest is : "+si);

	}

}
