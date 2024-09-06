package javaPracticePrograms;
import java.util.Scanner;

public class Volumeofcuboid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of the cuboid:  ");
		double length = sc.nextDouble();
		System.out.println("enter the breadth of the cuboid :  ");
		double breadth = sc.nextDouble();
		System.out.println("enter the height of the cuboid :  ");
		double height = sc.nextDouble();
		double volume=  (length * breadth * height );
		System.out.println("the area of the  cuboid: " + volume);

	}

}
