package jcom.codegnan.javapractice;
import java.util.Scanner;

public class dowhileswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in); 
		 int choice;
		System.out.println("Weclome to the vending machine");
		System.out.println("menu");
		System.out.println("1.coke");
		System.out.println("2.pepsi");
		System.out.println("3.water");
		System.out.println("4.soda");
		System.out.println("5.sprite");
		System.out.println("exit");
		do {
			System.out.println("enter your choice 1 t0 6");
			choice = sc.nextInt();
			switch(choice){
			case 1: 
				System.out.println("you have selected coke enjoy your drink");
				break;
			
		    case 2: 
		    	System.out.println("you have selected pepsi enjoy your drink");
		    	break;
		    case 3: 
		    	System.out.println("you have selected water enjoy your drink");
		    	break;
		    case 4: 
		    	System.out.println("you have selected soda enjoy your drink");
		    	break;
		    case 5: 
		    	System.out.println("you have selected sprite enjoy your drink");
		    	break;
		    case 6: 
		    	System.out.println("thanks for using vending machine.. have a nice day");
		    	break;
		    default:
		    	System.out.println("Invalid choice. Please select a valid option...");
		    	break;   	
		}
		System.out.println();			
		}
		while(choice !=6);


	}

}
