package javaPracticePrograms;
import java.util.Scanner;
public class Volumeofcube {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of the cube :  ");
		double side = sc.nextDouble();
		double volume  =  side * side * side ;
		System.out.println("the volume of cube: " + volume);

	}

}
