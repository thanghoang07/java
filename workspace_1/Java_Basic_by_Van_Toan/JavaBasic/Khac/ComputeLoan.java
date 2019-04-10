package Khac;
import java.util.Scanner;

public class ComputeLoan {
	public static void main(String[] args) {
		// tao scanner
		Scanner input = new Scanner(System.in);
		// nhap lai suat hang nam
		System.out.print("Enter yearly interest rate, for example 8.25: ");
		double annualInterestRate = input.nextDouble();
		// lai suat hang thang
		double monthlyInterestRate = annualInterestRate / 1200;
		// nhap so nam
		System.out
				.print("Enter number of years as an integer, foe example 5: ");
		int numberOfYears = input.nextInt();
		// nhap so tien vay
		System.out.print("Enter loan amount, for example 120000.95: ");
		double loanAmount = input.nextDouble();
		// tinh tien phai tra hang thang
		double monthlyPayment = loanAmount
				* monthlyInterestRate
				/ (1 - 1 / Math
						.pow(1 + monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		// hien thi ket qua
		System.out.println("The monthly payment is " + (int) (monthlyPayment * 100) / 100.0);
		System.out.println("The total payment is " + (int) (totalPayment * 100) / 100.0);
	}
}
