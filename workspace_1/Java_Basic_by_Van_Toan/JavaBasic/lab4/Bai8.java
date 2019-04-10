package lab4;

import java.util.Scanner;

public class Bai8 {
	public static int[][] createArray(int m, int n) {
		int[][] arrInts = new int[m][n];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("a[%d,%d] = ", i, j);
				arrInts[i][j] = in.nextInt();
			}
		}
		return arrInts;
	}

	public static void printArray(int[][] arrInts) {
		System.out.print("Ma trận đã nhập vào là : ");
		for (int i = 0; i < arrInts.length; i++) {
			System.out.printf("\n");
			for (int j = 0; j < arrInts[i].length; j++) {
				System.out.printf("%4d", arrInts[i][j]);
			}
		}
	}

	public static int max(int[][] arrInts, int m, int n) {
		int max = arrInts[0][0];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (arrInts[i][j] > max) {
					max = arrInts[i][j];
				}
			}
		}
		return max;
	}

	public static int min(int[][] arrInts, int m, int n) {
		int min = arrInts[0][0];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (arrInts[i][j] < min) {
					min = arrInts[i][j];
				}
			}
		}
		return min;
	}

	public static int total(int[][] arrInts, int m, int n) {
		int total = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				total += arrInts[i][j];
			}
		}
		return total;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap so dong: ");
		int m = in.nextInt();
		System.out.print("Nhap so cot: ");
		int n = in.nextInt();
		int arrInts[][] = new int[m][n];

		arrInts = createArray(m, n);
		printArray(arrInts);
		System.out
				.printf("\na.Phần tử lớn nhất của ma trận là: %d \n  Phần tử nhỏ nhất của ma trận là: %d",
						max(arrInts, m, n), min(arrInts, m, n));
		System.out.printf("\nb.Tổng các phần tử của ma trận là: %d",
				total(arrInts, m, n));
	}

}
