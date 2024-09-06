package javaPracticePrograms;
import java.util.Scanner;

public class Volumeareaofsemisphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius of the semi sphere  : ");
		double radius   = sc. nextDouble(); 
		double area = 3* 3.14 * (radius *radius);
		System.out.println("the area of semi sphere: " + area);
		double volume =((double)2/3)* 3.14 * (radius *radius *radius);
        System.out.println("the volume of semisphere: " + volume);


	}

}
