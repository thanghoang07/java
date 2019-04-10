package Mang1Chieu;

import java.util.Scanner;

public class Demo {
	public static int[][] createArray(int n) {
		int[][] maTran = new int[n][n];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("a[%d][%d] = ", i, j);
				maTran[i][j] = in.nextInt();
			}
		}
		return maTran;
	}

	public static void printArray(int[][] maTran) {
		System.out.println("Ma tran sau khi nhap la: ");
		for (int i = 0; i < maTran.length; i++) {
			for (int j = 0; j < maTran[i].length; j++) {
				System.out.printf("%4d", maTran[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap vao n: ");
		int n = in.nextInt();
		int[][] maTran = new int[n][n];

		maTran = createArray(n);
		printArray(maTran);
	}
}
