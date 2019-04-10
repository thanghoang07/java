package ReNhanh;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap vao a: ");
		double a = in.nextDouble();
		System.out.println("Nhap vao b: ");
		double b = in.nextDouble();
		System.out.println("Nhap vao c: ");
		double c = in.nextDouble();

		giaiPT(a, b, c);
	}

	public static void giaiPT(double a, double b, double c) {
		if (a != 0) {
			if (delta(a, b, c) > 0)
				System.out.println(
						"Phuong trinh co 2 nghiem phan biet x1 = " + ((-b + Math.sqrt(delta(a, b, c))) / (2 * a))
								+ " x2 = " + ((-b - Math.sqrt(delta(a, b, c))) / (2 * a)));
			if (delta(a, b, c) == 0)
				System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + ((-b) / (2 * a)));
			if (delta(a, b, c) < 0)
				System.out.println("Phuong trinh vo nghiem");
		} else if (b != 0)
			System.out.println("Phuong trinh co nghiem x = " + ((-c) / b));
		else
			System.out.println("Phuong trinh co vo so nghiem");

	}

	public static double delta(double a, double b, double c) {
		return b * b - 4 * a * c;
	}
}
