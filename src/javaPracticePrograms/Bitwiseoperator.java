package javaPracticePrograms;
import java.util.Scanner;

public class Bitwiseoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num1:  ");
		int num1= sc. nextInt();
		System.out.println("enter the num2:  ");
		int num2 = sc. nextInt();
		//BITWISE AND//
	    int bitwiseAnd = num1 & num2;
	    System.out.println("Bitwise AND (" + num1 + " & " + num2 + ") : " + bitwiseAnd);
	    //BITWISE OR//
	    int bitwiseOr = num1 | num2;
	    System.out.println("Bitwise OR (" + num1 + " | " + num2 + ") : " + bitwiseOr);
	    //BITWISE XOR//
	    int bitwiseXor = num1 ^ num2;
	    System.out.println("Bitwise XOR (" + num1 + " ^ " + num2 + ") : " + bitwiseXor);
	    //BITWISE COMPLEMENT//
	    int bitwiseComplementNum1 = ~num1;
	    System.out.println("Bitwise NOT (~" + num1 + ") : " + bitwiseComplementNum1);
	    //BITWISE LEFT SHIFT//
	    int leftShiftNum1 = num1 << 1;
	    System.out.println("Left Shift (" + num1 + " << 1) : " + leftShiftNum1);
	     //BITWISE RIGHT SHIFT//
	    int rightShiftNum2 = num2 >> 1;
	    System.out.println("Right Shift (" + num2 + " >> 1) : " + rightShiftNum2);
	    // BITWISE UNSIGNED RIGHTSHIFT// 
	    int unsignedRightShiftNum2= num2 >>> 1;
	    System.out.println("Unsigned Right Shift (" + num2 + " >>> 1) : " + unsignedRightShiftNum2);		

	}

}
