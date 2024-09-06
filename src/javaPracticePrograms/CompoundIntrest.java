package javaPracticePrograms;

public class CompoundIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principal = 12;
		double time = 12;
		double rate = 13;
		double CI = principal * 
                (Math.pow((1 + rate / 100), time));
		 System.out.println("the simple intrest is : "+CI);

	}

}
