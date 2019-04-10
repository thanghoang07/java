package lab5;

import java.util.Scanner;

public class Bai5 {
	public static int[][] creatArrayA(int n) {
		Scanner sc = new Scanner(System.in);
		int[][] maTran = new int[n][n];
		for (int row = 0; row < n; row++) {
			for (int colum = 0; colum < n; colum++) {
				System.out.print("A[" + row + "]" + "[" + colum + "]=");
				maTran[row][colum] = sc.nextInt();
			}
		}
		return maTran;
	}

	public static int[][] creatArrayB(int n) {
		Scanner sc = new Scanner(System.in);
		int[][] maTran = new int[n][n];
		for (int row = 0; row < n; row++) {
			for (int colum = 0; colum < n; colum++) {
				System.out.print("B[" + row + "]" + "[" + colum + "]=");
				maTran[row][colum] = sc.nextInt();
			}
		}
		return maTran;
	}

	public static void printArray(int[][] maTran) {
		for (int i = 0; i < maTran.length; i++) {
			for (int j = 0; j < maTran[i].length; j++) {
				System.out.print("  " + maTran[i][j] + "   ");
			}
			System.out.println("");
		}

	}

	public static void tongHaiMaTran(int[][] A, int[][] B, int[][] C, int n) {
		for (int row = 0; row < n; row++) {
			for (int colum = 0; colum < n; colum++) {
				C[row][colum] = A[row][colum] + B[row][colum];
				System.out.print("  " + C[row][colum] + "   ");
			}
			System.out.println("");
		}

	}

	public static void hieuHaiMaTran(int[][] A, int[][] B, int[][] C, int n) {
		for (int row = 0; row < n; row++) {
			for (int colum = 0; colum < n; colum++) {
				C[row][colum] = A[row][colum] - B[row][colum];
				System.out.print("  " + C[row][colum] + "   ");
			}
			System.out.println("");
		}

	}

	public static void tichHaiMaTran(int[][] A, int[][] B, int[][] C, int n) {
		for (int row = 0; row < n; row++) {
			for (int colum = 0; colum < n; colum++) {
				C[row][colum] = 0;
				// vong for muc đích là cộng giá trị C sau khi nhân vào
				for (int k = 0; k < n; k++) {
					C[row][colum] = C[row][colum] + A[row][k] * B[k][colum];
				}

			}

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào số hàng của ma trận: ");
		int n = sc.nextInt();
		// khoi tao ma tran A
		int[][] A = new int[n][n];
		// khoi tao ma tran B
		int[][] B = new int[n][n];
		// khoi tao ma tran C
		int[][] C = new int[n][n];
		A = creatArrayA(n);
		System.out.println("Ma trận A là: ");
		printArray(A);
		B = creatArrayB(n);
		System.out.println("Ma trận B là: ");
		printArray(B);

		// cau a: Tinh tong C = A + B
		System.out.println("Ma trận C là tổng của hai ma trận trên là: ");
		tongHaiMaTran(A, B, C, n);
		System.out.println("Ma trận C là tích của hai ma trận trên là: ");
		tichHaiMaTran(A, B, C, n);
		// in mảng C/
		printArray(C);
		// cau b: Tính ma trận hiệu D = A - B
		System.out.println("Ma trận C là hiệu của hai ma trận trên là: ");
		hieuHaiMaTran(A, B, C, n);
	}
}
