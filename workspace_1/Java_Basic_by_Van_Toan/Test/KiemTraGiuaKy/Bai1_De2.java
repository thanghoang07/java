package KiemTraGiuaKy;

import java.util.Scanner;

public class Bai1_De2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap a:");
		double a = in.nextDouble();
		System.out.print("Nhap b:");
		double b = in.nextDouble();
		System.out.print("Nhap c:");
		double c = in.nextDouble();

		phuongTrinhBac2(a, b, c);
	}

	public static double delta(double a, double b, double c) {
		return (b * b) - (4 * a * c);
	}

	public static void phuongTrinhBac2(double a, double b, double c) {
		if (a != 0) {
			if (delta(a, b, c) > 0)
				System.out.print("Phuong trinh co 2 nghiem phan biet x1 = " + (-b + Math.sqrt(delta(a, b, c)) / (2 * a))
						+ "\nx2 = " + (-b - Math.sqrt(delta(a, b, c)) / (2 * a)));
			else if (delta(a, b, c) < 0)
				System.out.print("Phuong trinh vo nghiem");
			else if (delta(a, b, c) == 0)
				System.out.print("Phuong trinh co nghiem kep x1 = x2 = " + ((-b) / (2 * a)));
			else if (b != 0)
				System.out.print("Phuong trinh co nghiem x = " + (-c / b));
			else
				System.out.print("Phuong trinh co vo so nghiem");
		}
	}
}
