package lab5;

import java.util.Scanner;

public class Bai3 {
	public static int[][] createArray(int n) {
		int[][] arrInts = new int[n][n];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("a[%d,%d] = ", i, j);
				arrInts[i][j] = in.nextInt();
			}
		}
		return arrInts;
	}

	public static void printArray(int[][] arrInts) {
		for (int i = 0; i < arrInts.length; i++) {
			for (int j = 0; j < arrInts[i].length; j++) {
				System.out.print("  " + arrInts[i][j] + "   ");
			}
			System.out.println("");
		}

	}

	public static void chuyenVi(int[][] arrInts, int n) {
		for (int row = 0; row < n; row++) {
			for (int column = 0; column < n; column++) {
				System.out.print("  " + arrInts[column][row] + "   ");
			}
			System.out.println("");
		}

	}

	public static void hoanViMaTran(int[][] arrInts, int n) {
		for (int row = 0; row < n; row++) {
			for (int column = 0; column < n / 2; column++) {
				int dauTien = arrInts[row][column];
				arrInts[row][column] = arrInts[row][n - column - 1];
				arrInts[row][n - column - 1] = dauTien;
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap vào ma trận vuông cấp n: ");
		int n = in.nextInt();
		int arrInts[][] = new int[n][n];

		arrInts = createArray(n);
		printArray(arrInts);
		System.out.println("Mảng sau khi chuyển vị là : ");
		chuyenVi(arrInts, n);
		System.out.println("Ma trận sau khi hoán vị là : ");
		hoanViMaTran(arrInts, n);
		printArray(arrInts);
	}
}
