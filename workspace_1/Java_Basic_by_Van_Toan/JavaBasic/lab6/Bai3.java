package lab6;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhập vào chuỗi s: ");
		String s = in.nextLine();
		System.out.print("Nhập vào chuỗi s1: ");
		String s1 = in.nextLine();

		// Tìm vị trí đầu tiên chuỗi s1 xuất hiện trong chuỗi s.
		System.out
				.print("Vị trí đầu tiên chuỗi s1 xuất hiện trong chuỗi s là: ");
		dauTienSTrongS1(s, s1);
	}

	public static void dauTienSTrongS1(String s, String s1) {
		char dauTien = s.charAt(0);
		char[] charS1 = s1.toCharArray();
		for (int i = 0; i < s1.length(); i++) {
			if (charS1[i] == dauTien)
				System.out.print(i + "  ");
		}
	}
}
