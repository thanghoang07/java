package lab4_by_Van_Toan;

import java.util.Scanner;

public class Bai10 {
	private static Scanner nhapVao;

	public static void printStars1(int n) {
		if (n > 0) {
			for (int i = 0; i < n; i++) {
				System.out.print("*");
			}
			System.out.println();

			printStars1(n - 1);

			for (int i = n; i > 0; i--) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

	public static void printStars2(int n, int max) {
		if (n > max) {
			return;
		} else {
			for (int i = 0; i < n; i++) {
				System.out.print("*");
			}
			System.out.println();

			printStars2(n + 1, max);

			for (int i = 0; i < n; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao n: ");
		int n = nhapVao.nextInt();
		printStars1(n);
		System.out.println();
		printStars2(1, n);
	}
}
