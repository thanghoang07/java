package lab4_by_Van_Toan;

import java.util.Scanner;

public class Bai6 {
	private static Scanner nhapVao;

	public static int tongSoNguyen(int n) {
		if (n < 10)
			return n;
		else
			return n % 10 + tongSoNguyen(n / 10);
	}

	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = nhapVao.nextInt();
		System.out.println("Tổng : " + tongSoNguyen(n));
	}
}
