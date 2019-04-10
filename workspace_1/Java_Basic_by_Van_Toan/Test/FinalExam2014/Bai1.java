package FinalExam2014;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Số tiền gửi:");
		double p = in.nextDouble();
		System.out.print("Lãi suất gửi từng tháng: ");
		double r = in.nextDouble();
		System.out.print("Số tháng gởi: ");
		int n = in.nextInt();

		System.out.println("1. Các số Amstrong có 3 chữ số là : ");
		amstrong();
		System.out.printf("\n2. Số tiền sẽ được rút ra sau %d là : %,.4f", n,
				soTien(p, r, n));
	}

	public static void amstrong() {
		int result = 0;
		for (int i = 100; i < 1000; i++) {
			int a = i % 10;
			int b = (i / 10) % 10;
			int c = (i / 100);
			int ketQua = a * a * a + b * b * b + c * c * c;
			if (i == ketQua) {
				result = i;
				System.out.print(result + "  ");
			}
		}

	}

	public static double mu(double x, int n) {
		double mu = 1;
		for (int i = 0; i < n; i++) {
			mu *= x;
		}
		return mu;
	}

	public static double soTien(double p, double r, int n) {
		return p * mu((1 + r), n);
	}
}
