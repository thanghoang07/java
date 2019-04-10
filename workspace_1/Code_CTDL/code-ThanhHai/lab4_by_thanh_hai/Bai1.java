package lab4_by_thanh_hai;

import java.util.Scanner;

public class Bai1 {
	private static Scanner nhapVao;

	public static String daoChuoi(String s, int n) {
		if (n == 1) {
			return s = s.charAt(n - 1) + "";
		} else {
			return s.charAt(n - 1) + daoChuoi(s, n - 1) + "";
		}
	}

	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		System.out.print("-Nhap vao mot chuoi cac ky tu (s): ");
		String s = nhapVao.next();
		System.out.println(" =>Chuoi sau khi dao la: " + daoChuoi(s, s.length()));
	}
}
