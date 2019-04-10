package lab4;

import java.util.Scanner;

public class Bai9 {
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

	public static void sumRow(int[][] arrInts, int m, int n) {
		for (int row = 0; row < n; row++) {
			int total = 0;
			for (int column = 0; column < m; column++) {
				total += arrInts[row][column];
			}
			System.out.print("\nTổng của hàng " + row + " là " + total);
		}
	}

	public static void largestSumRow(int[][] arrInts, int m, int n) {
		int maxRow = 0;
		int indexOfMaxRow = 0;

		// tong hang dau tien
		for (int column = 0; column < n; column++) {
			maxRow += arrInts[0][column];
		}
		for (int row = 0; row < n; row++) {
			int totalOfThisRow = 0;
			for (int column = 0; column < m; column++) {
				totalOfThisRow += arrInts[row][column];
				// so sanh tong hang tiep theo vs tong hang dau tien
				if (totalOfThisRow > maxRow) {
					maxRow = totalOfThisRow;
					indexOfMaxRow = row;
				}
			}

		}
		System.out.printf("\nDòng %d có tổng lớn nhất là: %d", indexOfMaxRow,
				maxRow);
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

		sumRow(arrInts, m, n);
		largestSumRow(arrInts, m, n);
	}
}
