package lab5;

import java.util.Scanner;

public class Bai6 {
	public static int[][] createArrayA(int m, int p) {
		int[][] arrInts = new int[m][p];
		Scanner in = new Scanner(System.in);
		for (int row = 0; row < m; row++) {
			for (int column = 0; column < p; column++) {
				System.out.printf("A[%d,%d] = ", row, column);
				arrInts[row][column] = in.nextInt();
			}
		}
		return arrInts;
	}

	public static int[][] createArrayB(int p, int n) {
		int[][] arrInts = new int[p][n];
		Scanner in = new Scanner(System.in);
		for (int row = 0; row < p; row++) {
			for (int column = 0; column < n; column++) {
				System.out.printf("B[%d,%d] = ", row, column);
				arrInts[row][column] = in.nextInt();
			}
		}
		return arrInts;
	}

	public static void printArray(int[][] arrInts) {
		for (int i = 0; i < arrInts.length; i++) {
			for (int j = 0; j < arrInts[i].length; j++) {
				System.out.print(arrInts[i][j] + "\t");
			}
			System.out.println("");
		}

	}

	public static void tichHaiMaTran(int[][] A, int[][] B, int[][] C, int p, int m) {
		for (int row = 0; row < m; row++) {
			for (int colum = 0; colum < p; colum++) {
				C[row][colum] = 0;
				// vong for muc dich la cong gia tri C sau khi nhan vao
				for (int k = 0; k < p; k++) {
					C[row][colum] += A[row][k] * B[k][colum];
				}

			}

		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap vao so HANG cua ma tran A: ");
		int m = in.nextInt();
		System.out.print("Nhap vao so COT ma tran A = so HANG ma tran B: ");
		int p = in.nextInt();
		System.out.print("Nhap vao so COT ma tran B: ");
		int n = in.nextInt();

		int[][] A = new int[m][p];
		A = createArrayA(m, p);
		System.out.println("Ma tran A la: ");
		printArray(A);

		int[][] B = new int[p][n];
		B = createArrayB(p, n);
		System.out.println("Ma tran B la: ");
		printArray(B);

		int[][] C = new int[m][n];

		System.out.println("Ma tran C la tich cua hai ma tran tran la: ");
		tichHaiMaTran(A, B, C, p, m);
		// in mảng C/
		printArray(C);
	}
}
