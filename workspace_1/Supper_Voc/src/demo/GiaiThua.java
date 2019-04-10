package demo;

import java.util.Scanner;

public class GiaiThua {
	public static void main(String[] args) throws Exception {
		int i;
		int j = 1;
		Scanner in = new Scanner(System.in);
		System.out.println("Hay nhap vao 1 so: ");
		int n = in.nextInt();
		for (i = 1; i <= n; i++) {
			j *= i;
		}
		System.out.println("Giai thua cua " + n + " la " + j);

	}

}
