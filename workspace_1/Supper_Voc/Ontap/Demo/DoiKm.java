package Demo;

import java.util.Scanner;

public class DoiKm {
	public final static double mile = 1.609;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("so mile la: ");
		double x = input.nextDouble();
		chuyen(x);
	}

	public static void chuyen(double x) {
		double y = x * mile;
		System.out.printf("so km la: %f", y);
	}
}
