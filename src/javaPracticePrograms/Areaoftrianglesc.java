package javaPracticePrograms;
import java.util.Scanner;

public class Areaoftrianglesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the base of the triangle: ");
		 Double base  = sc.nextDouble();
		System.out.println("enter the height  of the triangle: ");
		Double height = sc.nextDouble();
		 Double area = (base * height)/2;
		 System.out.println("the area  of the triangle: "+area);
		 


	}

}
