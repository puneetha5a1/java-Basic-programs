package jcom.codegnan.javapractice;
import java.util.*;
public class FibanocciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int numberofterms=sc.nextInt();
		int firstterm = 0;
		int secondterm = 1;
		System.out.println("fibanocci series: ");
		System.out.println(firstterm+" "+secondterm+ " ");
		for(int i =2;i<numberofterms;i++) {
			int nextterm=firstterm+secondterm;
			System.out.print(nextterm+ " ");
			firstterm = secondterm;
			secondterm= nextterm;
		}
	}
}
 

