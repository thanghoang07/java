package tuan7_recursion;

import java.util.Scanner;

public class Baixx {
	private static Scanner nhapVao;

	public static void main(String args[]) {
		nhapVao = new Scanner(System.in);
		System.out.println("Nhap vao n: ");
		int n = nhapVao.nextInt();

		int i, j;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for (i = n; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println();
		for (i = n; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
