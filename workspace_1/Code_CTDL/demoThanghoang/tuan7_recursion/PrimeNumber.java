package tuan7_recursion;

import java.util.Scanner;

public class PrimeNumber {
	private static Scanner nhapVao;

	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		int constant = 0;
		int variable = 0;
		System.out.println("Enter a Number to test if Prime or Not");
		constant = nhapVao.nextInt();
		variable = constant;
		double answer = 0.0;
		answer = testPrime(constant, variable);
		System.out.println(+answer);
		if (answer == 1) {
			System.out.println(+constant + " is a prime number.");
		} else {
			System.out.println(+constant + " is NOT a prime number.");
		}
	}

	public static double testPrime(int number, int divide) {
		double prime = 0.0;
		prime = number % divide;
		if (prime > 0 && divide != number) {
			return testPrime(number, divide - 1);
		} else {
			return prime;
		}
	}
}
