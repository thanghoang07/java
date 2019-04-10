package Lab02_06;

import java.util.Scanner;

public class TamGiacHinhThoi {
	public static void printArray(int[][] maTran, int n) {
		for (int i = 0; i < maTran.length; i++) {
			 for (int k = 0; k < n - i; k++) {
			 System.out.print(" ");
			 }
			for (int j = 0; j < maTran[i].length; j++) {
				System.out.print(maTran[i][j] + "  ");
			}
			System.out.println("");
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhập vào n : ");
		int n = in.nextInt();
		int maTran[][] = new int[n * 2 - 1][n];

		inTamGiac(maTran, n);
		printArray(maTran, n);

	}

	public static void inTamGiac(int[][] maTran, int n) {
		int k = 1;
		int x = 2;
		for (int i = 0; i < n * 2 - 1; i++) {
			if (i < n) {
				maTran[i] = new int[i + 1];
				maTran[i][i] = maTran[i].length;
			} else {
				maTran[i] = new int[i - k];
				k += 2;
				maTran[i][i - x] = maTran[i].length;
				x +=2;
			}
			maTran[i][0] = 1;
			for (int j = 1; j < i; j++) {
				if (i < n)
					maTran[i][j] = maTran[i][j - 1] + 1;
			}
		}
	}
}
