package lab4_by_Van_Toan;

import java.util.Scanner;

public class Bai7 {
	private static Scanner nhapVao;

	public static String inNguocSo(int n) {
		if (n < 10)
			return n + "";
		else
			return n % 10 + inNguocSo(n / 10) + "";

	}

	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = nhapVao.nextInt();
		System.out.println("So in nguoc: " + inNguocSo(n));
	}
}
