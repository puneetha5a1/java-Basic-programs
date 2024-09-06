package jcom.codegnan.javapractice;
import java.util.Scanner;
public class printingthenumbersusingdowhile {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in); 
		 System.out.println("enter the number : ");
		 int number = sc.nextInt();
		 int i = 0;
		 do {
			 System.out.println(i);
			 i++;
		 }
		 while (i<=number);
		 
		 }

}
