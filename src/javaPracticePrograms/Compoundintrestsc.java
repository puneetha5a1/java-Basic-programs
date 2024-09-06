package javaPracticePrograms;
import java.util.Scanner;

public class Compoundintrestsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the principle amount: ");
		float principle = sc. nextFloat();
		System.out.println("enter the time: ");
	    float time  =  sc.nextFloat();
		System.out.println("enter the rate : ");
		float rate  = sc. nextFloat();
		double CI = principle * 
                (Math.pow((1 + rate / 100), time));
		 System.out.println("the compound  intrest is : "+CI);

	}

}
