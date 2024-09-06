package javaPracticePrograms;
import java.util.Scanner;
public class Volumeareaofsphere {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius of the sphere  : ");
		double radius   = sc. nextDouble(); 
		double area = 4 * 3.14 * (radius *radius);
		System.out.println("the area of sphere: " + area);
		double volume =((double)4/3)* 3.14 * (radius *radius *radius);
        System.out.println("the volume of sphere: " + volume);


	}

}
