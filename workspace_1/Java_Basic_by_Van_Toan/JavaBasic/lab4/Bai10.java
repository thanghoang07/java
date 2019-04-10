package lab4;

import java.util.Scanner;

public class Bai10 {
	public static int[][] createArray(int n) {
		int[][] arrInts = new int[n][n];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("a[%d,%d] = ", i, j);
				arrInts[i][j] = in.nextInt(10);
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

	public static boolean kiemTraTren(int[][] arrInts, int n) {
		boolean ketQua = false;
		for (int row = 1; row < n; row++) {
			for (int column = 0; column < n; column++) {
				if (row > column) {
					if (arrInts[row][column] == 0 && arrInts[row][row] != 0) {
						ketQua = true;
					} else
						ketQua = false;
				}
			}
		}
		return ketQua;
	}

	public static boolean kiemTraDoiXung(int[][] arrInts, int n) {
		for (int row = 1; row < n; row++) {
			for (int column = 0; column < n; column++) {
				if (arrInts[row][column] != arrInts[column][row])
					return false;
			}
		}
		return true;
	}

	public static boolean kiemTraDuongCheoChinh(int[][] arrInts, int n) {
		for (int row = 0; row < n / 2; row++) {
			for (int column = row; column < n / 2; column++) {
				if (arrInts[row][column] != arrInts[n - row - 1][n - column - 1])
					return false;
			}
		}
		return true;
	}

	public static boolean doiXungTam(int[][] arrInts, int n) {
		for (int row = 0; row < n; row++) {
			for (int column = 0; column < n; column++) {
				if (arrInts[row][column] != arrInts[n - row - 1][n - column - 1])
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap vào ma trận vuông cấp n: ");
		int n = in.nextInt();
		int arrInts[][] = new int[n][n];

		arrInts = createArray(n);
		printArray(arrInts);

		// cau a. Kiểm tra ma trận có là ma trận tam giác trên không?
		if (kiemTraTren(arrInts, n) == true)
			System.out.println("\nMa trận trên là ma trận tam giác trên");
		else
			System.out
					.println("\nMa trận trên không phải là ma trận tam giác trên");
		// cau b. Kiểm tra ma trận có đối xứng qua đường chéo chính hay không.
		if (kiemTraDoiXung(arrInts, n) == true)
			System.out.println("Ma trận đối xứng");
		else
			System.out.println("Ma trận không đối xứng");
		// kiem tra doi xung tam
		if (doiXungTam(arrInts, n) == true)
			System.out.println("Ma trận đối xứng qua tâm");
		else
			System.out.println("Ma trận không đối xứng qua tâm");
	}
}
