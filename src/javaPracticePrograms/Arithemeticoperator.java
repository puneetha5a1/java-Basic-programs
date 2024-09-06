package javaPracticePrograms;
import java.util.Scanner;
public class Arithemeticoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the revenue : ");
		double revenue   = sc. nextDouble();
		System.out.println("enter the expenses: ");
	    double expenses   = sc. nextDouble();
	    double profit = revenue - expenses;
        double profitMargin = (profit / revenue) * 100;
        System.out.println("Revenue: $" + revenue);
        System.out.println("Expenses: $" + expenses);
        System.out.println("Profit: $" + profit);
        System.out.println("Profit Margin: " + profitMargin + "%");

	}

}
