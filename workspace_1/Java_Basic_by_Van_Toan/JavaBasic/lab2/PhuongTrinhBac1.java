package lab2;

import java.util.Scanner;

public class PhuongTrinhBac1 {
	public static void main(String[] args) {
		// tao scanner
		Scanner input = new Scanner(System.in);
		// yeu cau nhap 2 so a, b
		System.out.print("Hệ số a: ");
		double a = input.nextInt();
		System.out.print("Hệ số b: ");
		double b = input.nextInt();
		if (a != 0)
			System.out.println("Phương trình có nghiệm x = " + (-b/a));
		else
			System.out.println("Phương trình Vô Nghiệm");
	}
}
