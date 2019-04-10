package inHinhSao;

import java.util.Scanner;

public class Mau1 {
	public static void inSaoXuoi(int n, int max) {
		for (int i = 1; i <= n; i++)
			System.out.print("*");
		System.out.println();
		if (n < max)
			inSaoXuoi(n + 1, max);
	}

	public static void inSaoNguoc(int n, int max) {
		if (n < max)
			inSaoNguoc(n + 1, max);
		for (int i = 1; i <= n; i++)
			System.out.print("*");
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.print("nhap vao n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println();
		inSaoNguoc(1, n);
	}
}
