package thucHanhJavaBasic1;

import java.util.Scanner;

public class JavaBasic1 {
	public static void main(String[] args) {
// 		Create a Scanner object
		System.out.println("Please input one integer and one floating-point number:");
		Scanner input = new Scanner(System.in);
		
//		Prompt the user to enter a values x
		System.out.print("Enter a number for X: ");
		int soX = input.nextInt();
//		Prompt the user to enter a values y
		System.out.print("Enter a number for Y: ");
		double soY = input.nextDouble();
//		Display result
		System.out.println("Input values are" + soX + "and " + soY + "their product is " + soX*soY);
	}
}
