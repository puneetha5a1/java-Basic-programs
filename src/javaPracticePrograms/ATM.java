package javaPracticePrograms;
import java.util.Scanner;
public class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int oPin = 123;
		 double balance = 0.0;
		 System.out.println("welcome to atm ");
		 System.out.println("enter the pin : ");
		 int uPin =sc.nextInt();
		 if(oPin!=uPin) {
		 System.out.println("sorry invalid pin try again later...");
		 return;
		 }
		 boolean exit=false;
		 while(!exit) {
			 System.out.println("1.check balance");
			 System.out.println("2.withdraw amount");
			 System.out.println("3.deposit amount");
			 System.out.println("4.exit");
			 int op = sc.nextInt();			 
			 switch(op) {
			 case 1:
				 System.out.println("Your balance = " +balance);
			 break;
			 case 2:
				 System.out.println("enter your amount :");
				 double amount = sc.nextDouble();
				 if(balance>=amount) {
					 balance-=amount;
					 System.out.println(amount+"is successfully withdrawn");
				 }					 
				 else
					 System.out.println("insufficient balance");
			 break;
			 case 3:
			 System.out.println("enter amount to deposit: ");
			 double damount = sc.nextDouble();
			 balance+=damount;
			 System.out.println(damount+"is sucessfully deposited");
			 break;
			 case 4:
				 System.out.println("exiting");
				 System.out.println("thankyou for using application");
				 exit=true;
				 break;
				 
			 default:
				 System.out.println("Invalid option..");
			 }
		 }
	}

}
