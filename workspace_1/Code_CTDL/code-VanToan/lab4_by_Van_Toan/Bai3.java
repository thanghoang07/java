package lab4_by_Van_Toan;

import java.util.Scanner;

public class Bai3 {
	String result = "";
	private static Scanner nhapVao;

	public static String nhiPhan(int n) {
		if ((n == 0) || (n == 1))
			return n + "";
		else
			return nhiPhan(n / 2) + (n % 2) + "";

	}

	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap 1 so nguyen : ");
		int n = nhapVao.nextInt();
		System.out.println("So nhi phan: " + nhiPhan(n));
	}
}
