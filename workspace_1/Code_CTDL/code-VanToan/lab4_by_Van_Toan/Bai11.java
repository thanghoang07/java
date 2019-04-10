package lab4_by_Van_Toan;

import java.util.Scanner;

public class Bai11 {
	private static Scanner nhapVao;

	/*
	 * a lÃ  cá»™t nguá»“n b lÃ  cá»™t trung gian c lÃ  cá»�t Ä‘Ã­ch
	 */
	public static void thapHaNoi(int n, char A, char B, char C) {
		if (n == 1)
			System.out.println("Di chuyá»ƒn 1 Ä‘Ä©a " + " tá»« " + A + " sang " + C);
		else {
			thapHaNoi(n - 1, A, C, B);
			thapHaNoi(1, A, B, C);
			thapHaNoi(n - 1, B, A, C);
		}
	}

	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		System.out.print("Nháº­p sá»‘ Ä‘Ä©a : ");
		int n = nhapVao.nextInt();

		System.out.println("sau khi di chuyá»ƒn lÃ  : ");
		thapHaNoi(n, 'A', 'B', 'C');
	}
}
