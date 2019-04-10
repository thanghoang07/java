package lab4_by_Van_Toan;

import java.util.Scanner;

public class Bai2 {
	private static Scanner nhapVao;

	// n so phan tu le
	public static int tongSoLe(int n) {
		if (n == 0)
			return 1;
		else
			return (2 * n + 1) + tongSoLe(n - 1);

	}

	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap so phan tu: ");
		int n = nhapVao.nextInt();
		System.out.println("Tong cac so le: ");
		System.out.println(tongSoLe(n));
	}
}
