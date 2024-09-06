package jcom.codegnan.javapractice;

public class ExplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fahrenhiet= 77.0;
		int celsius = (int) ((fahrenhiet-32)*5/9);
		System.out.println("Temperature in fahrenhiet: "+fahrenhiet);
		System.out.println("Temperature in celsius (explicit): "+celsius);


	}

}

