package lab4_by_Van_Toan;

import java.util.Scanner;

public class Bai4 {
	private static Scanner nhapVao;

	public static String chuyenGiay(int n) {
		if (n < 60)
			return n + " giay";
		else if (n < 3600)
			return 0 + " gio " + (n / 60) + " phut " + chuyenGiay(n % 60);
		else
			return (n / 3600) + " gio " + ((n % 3600) / 60) + " phut " + chuyenGiay((n % 3600) % 60);
	}

	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		System.out.println("Nhap so giay: ");
		int n = nhapVao.nextInt();
		System.out.println(chuyenGiay(n));
	}
}
