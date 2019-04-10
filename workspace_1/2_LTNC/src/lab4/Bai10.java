package lab4;

import java.util.Random;

public class Bai10 {
	// i la hang
	// j la cot
	public final static int MAX = 10;

	// i la hang
	// j la cot
	public static int[][] creatMatrix(int soHang) {
		int[][] matrix = new int[soHang][soHang];
		Random ra = new Random();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i; j < matrix[i].length; j++) {
				matrix[i][j] = ra.nextInt(MAX);
			}
		}
		return matrix;
	}

	// i la hang
	// j la cot
	public static void print(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%3d", matrix[i][j]);
			}
			System.out.println();
		}
	}

	// i la hang
	// j la cot
	public static boolean kiemTraTren(int[][] matrix) {
		boolean ketQua = false;
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (i > j) {
					if (matrix[i][j] == 0 && matrix[i][i] != 0) {
						ketQua = true;
					} else
						ketQua = false;
				}
			}
		}
		return ketQua;
	}

	public static boolean kiemTraDoiXung(int[][] matrix) {
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] != matrix[j][i])
					return false;
			}
		}
		return true;
	}

	public static boolean kiemTraDuongCheoChinh(int[][] matrix) {
		for (int i = 0; i < matrix.length / 2; i++) {
			for (int j = i; j < matrix.length / 2; j++) {
				if (matrix[i][j] != matrix[matrix.length - i - 1][matrix.length - j - 1])
					return false;
			}
		}
		return true;
	}

	// i la hang
	// j la cot
	public static void main(String[] args) {
		int soHang = 4;
		int[][] matrix = creatMatrix(soHang);
		print(matrix);
		System.out.println();
		System.out.println(kiemTraTren(matrix));
		System.out.println(kiemTraDoiXung(matrix));
		System.out.println(kiemTraDuongCheoChinh(matrix));
	}
}
