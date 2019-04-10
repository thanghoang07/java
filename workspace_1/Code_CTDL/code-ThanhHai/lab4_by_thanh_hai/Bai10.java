package lab4_by_thanh_hai;

import java.util.Scanner;

public class Bai10 {
	private static Scanner nhapVao;

	public static void patternStar1(int n) {
		if (n > 1) {
			patternStar1(n - 1);
		}
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();

	}

	public static void patternStar2(int x, int n) {
		if (x < n) {
			patternStar2(x + 1, n);
		}
		for (int j = 0; j < x; j++) {
			System.out.print("*");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		System.out.print("-Nhap chieu cao(h): ");
		int n = nhapVao.nextInt();

		patternStar2(1, n);
		patternStar1(n);
		System.out.println();
		patternStar1(n);
		patternStar2(1, n);

	}
}
