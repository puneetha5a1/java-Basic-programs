package jcom.codegnan.javapractice;
import java.util.*;
public class Oddnumberusingforandif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		 System.out.println("enter the number : ");
		 int number = sc.nextInt();
		 for(int i = 1 ;i<=number;i++) {
			 if(i % 2 == 0) {
			 
			 continue;
		 }
			 System.out.println(i); 


	}

}
}

