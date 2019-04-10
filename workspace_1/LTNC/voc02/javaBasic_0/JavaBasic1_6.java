package javaBasic_0;
import java.util.Scanner;
public class JavaBasic1_6 {
	public static void main(String[] args)
	{
		//nhap tu ban phim
		Scanner input = new Scanner(System.in);
		//enter yearly interest rate
		System.out.print(
				"Enter yearly interest rate, for example 8.25: ");
		double annualInterestRate = input.nextDouble();
		//obtain monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;
		
		//Enter number of yeear
		System.out.println(
				"enter number of years as an integer, for example 5: ");
		int numberOfYears = input.nextInt();
		//Enter loan amount
		System.out.print(
				"Enter Loan amount, for example 120000.95: ");
		double loanAmount = input.nextDouble();
		//calculate payment
		double monthlyPayment = loanAmount * 
				monthlyInterestRate / (1 - 1 / Math.pow(1 +
				monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * 
							numberOfYears * 12;
		//display results
		System.out.println(
				"the monthly payment is " + (int) 
				(monthlyPayment * 100.0));
		System.out.println(
				"the total payment is " + (int)
				(totalPayment * 100) / 100.0);
	}

}
