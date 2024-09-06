package javaPracticePrograms;
import java.util.Scanner;
public class Studentdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name: ");
		String name  =  sc.next();
		
		System.out.println("enter the id: ");
		int id   = sc. nextInt();
		System.out.println("enter the gender: ");
		char gender  = sc. next().charAt(0);
		System.out.println("enter the marks: ");
		int marks   = sc. nextInt();
		
		 System.out.println("student details: ");
		 System.out.println("Name: " + name);
	     System.out.println("ID: " + id);
	     System.out.println("Gender: " + gender);
	      System.out.println("Marks: " + marks);


	}

}
