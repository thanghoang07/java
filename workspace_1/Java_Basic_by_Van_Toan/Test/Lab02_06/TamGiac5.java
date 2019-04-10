package Lab02_06;

import java.util.Scanner;

public class TamGiac5 {
	public static void printArray(int[][] maTran) {
		for (int i = 0; i < maTran.length; i++) {
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
		int maTran[][] = new int[n][];

		inTamGiac(maTran);
		printArray(maTran);

	}

	public static void inTamGiac(int[][] maTran) {
		for (int i = 0; i < maTran.length; i++) {
			maTran[i] = new int[i + 1];
			maTran[i][0] = 1;
			int giaTri = 4;
			for (int j = 1; j < i; j++) {
				maTran[i][i] = maTran[i][j] + giaTri;
				maTran[i][j] = maTran[i][j - 1] + giaTri;
				giaTri--;
			}

		}
	}
}
