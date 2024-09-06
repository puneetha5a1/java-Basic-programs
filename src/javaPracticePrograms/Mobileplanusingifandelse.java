package javaPracticePrograms;
import java.util.Scanner;


public class Mobileplanusingifandelse {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in); 
		 System.out.println("enter your mobile plan : ");
		 int minute = sc.nextInt();
		 if(minute <=100) {
			 System.out.println("yours is a basic plan");
		 }
		 else if(minute<=300) {
			 System.out.println("yours is a standard plan");
		 }
		 else if(minute<=500) {
			 System.out.println("yours is a premium plan");
		 }
		 else if(minute>500) {
			 System.out.println("yours is an unlimited plan");
		 }
	 
	 }	

}
