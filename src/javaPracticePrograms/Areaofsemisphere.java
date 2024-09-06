package javaPracticePrograms;
import java.util.Scanner;
public class Areaofsemisphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius of the semi circle :  ");
		double radius = sc.nextDouble();
		double area=   3.14 * (radius * radius )/2;
		System.out.println("the area of the  semi circle: " + area);

	}

}
