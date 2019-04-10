package ReNhanh;

import java.util.Scanner;

public class Bai6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap vao 3 so a, b , c:");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();

		// xet 3 canh tam giac
		if (xetCanhTamGiac(a, b, c) == true) {
			System.out.println("a, b , c la 3 canh cua tam giac");
			System.out.println("Chu vi cua tam giac la : "
					+ (nuaChuVi(a, b, c) * 2));
			System.out.printf("Dien tich cua tam giac tren la: %.4f",
					dienTichTamGiac(a, b, c));
			System.out.printf("\nGoc A: %f \nGoc B: %f \nGoc C: %f",
					Math.toDegrees(doDaiGocA(a, b, c)),
					Math.toDegrees(doDaiGocB(a, b, c)),
					Math.toDegrees(doDaiGocC(a, b, c)));

		} else
			System.out.println("a, b, c khong phai la 3 canh cua tam giac");
	}

	public static boolean xetCanhTamGiac(double a, double b, double c) {
		if (a + b > c && b + c > a && a + c > b)
			return true;
		else
			return false;
	}

	public static double nuaChuVi(double a, double b, double c) {
		return (a + b + c) / 2;

	}

	public static double dienTichTamGiac(double a, double b, double c) {
		return Math.sqrt(nuaChuVi(a, b, c) * (nuaChuVi(a, b, c) - a)
				* (nuaChuVi(a, b, c) - b) * (nuaChuVi(a, b, c) - c));
	}

	public static double doDaiGocA(double a, double b, double c) {
		return Math.acos((b * b + c * c - a * a) / (2 * b * c));

	}

	public static double doDaiGocB(double a, double b, double c) {
		return Math.acos((a * a + c * c - b * b) / (2 * a * c));
	}

	public static double doDaiGocC(double a, double b, double c) {
		return Math.acos((a * a + b * b - c * c) / (2 * a * b));
	}

}
