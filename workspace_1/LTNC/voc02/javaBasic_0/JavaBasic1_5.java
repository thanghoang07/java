package javaBasic_0;
import java.util.Scanner;
public class JavaBasic1_5 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("enter purchase amount: ");
		double purchaseAmount = input.nextDouble();
		
		double tax = purchaseAmount * 0.06;
		System.out.println(
				"sales tax is " + (int) (tax * 100) / 100.0);
	}

}
