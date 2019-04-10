package Demo;

import java.util.Scanner;

public class TamGiac {
	public static void main(String[] args) {
		// tao scanner
		Scanner input = new Scanner(System.in);
		// nhap 3 so a, b,c
		System.out.println("Nhap 3 so a, b, c : ");
		System.out.print("nhap a: ");
		double a = input.nextDouble();
		System.out.print("nhap b: ");
		double b = input.nextDouble();
		System.out.print("nhap c: ");
		double c = input.nextDouble();
		tinhTamGiac(a, b, c);
	}

	public static void tinhTamGiac(double a, double b, double c) {
		// tinh chu vi cua tam giac
		double chuVi = a + b + c;
		// tinh dien tich cua tam giac
		double dienTich = Math.sqrt(chuVi * (chuVi - a) * (chuVi - b) * (chuVi - c));
		double cosA = Math.acos((b * b + c * c - a * a) / (2 * b * c));
		double cosB = Math.acos((a * a + c * c - b * b) / (2 * a * c));
		double cosC = Math.acos((a * a + b * b - c * c) / (2 * a * b));
		// double tanA = Math.sqrt((1 / cosA * cosA) - 1);
		// double gocA = Math.atan(tanA);
		if ((a + b > c) && (b + c > a) && (a + c > b) && (a > 0) && (b > 0) && (c > 0))
			System.out.printf(
					"Ba sa da cho la  3 canh cua tam giac "
					+ "\nChu Vi cua tam giac la  : %.2f "
					+ "\nDien tich tam giac la  : %.4f "
					+ "\nGoc A = %.4f "
					+ "\nGoc B = %.4f "
					+ "\nGoc C = %.4f ",
					chuVi, dienTich, Math.toDegrees(cosA), Math.toDegrees(cosB), Math.toDegrees(cosC));
		else
			System.out.println("Ba so da cho khong phai la  canh tam giac");
	}
}
