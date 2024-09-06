package javaPracticePrograms;
import java.util.Scanner;

public class Studentmarksusingifandelse {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in); 
	 System.out.println("enter your marks: ");
	 int marks = sc.nextInt();
	 if(marks> 80) {
		 System.out.println("you have passed in distinction");
	 }
	 else if(marks>70 && marks<80) {
		 System.out.println("you have passed in first class");
	 }
	 else if(marks>60 && marks<70) {
		 System.out.println("you have passed in second class");
	 }
	 else if(marks>50 && marks<60) {
		 System.out.println("you have passed in third class");
	 }
	 else if(marks<50){
		 System.out.println("you are fail");
	 }	
	}


}
