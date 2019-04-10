package lab5;

import java.util.Random;
import java.util.Scanner;

public class Bai6 {
	public final static int MAX = 3;

	public static int[][] creatMatrix(int soHang) {
		int[][] matrix = new int[soHang][soHang];
		Random ra = new Random();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = ra.nextInt(MAX);
			}
		}
		return matrix;
	}

	public static void print(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%3d", matrix[i][j]);
			}
			System.out.println();
		}
	}

	public static int[][] congMatrix(int[][] matrix1, int[][] matrix2, int soHang) {
		int[][] matrixPlus = new int[soHang][soHang];
		for (int i = 0; i < matrixPlus.length; i++) {
			for (int j = 0; j < matrixPlus[0].length; j++) {
				matrixPlus[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		return matrixPlus;
	}

	public static int[][] nhanMatrix(int[][] matrix1, int[][] matrix2, int soHang){
		int[][] matrix3 = new int[soHang][soHang];
		for (int i = 0; i < matrix3.length; i++) {
			for (int j = 0; j < matrix3.length; j++) {
				matrix3[i][j] = 0;
				for (int k = 0; k < matrix3.length; k++) {
					matrix3[i][j] = matrix3[i][j] + matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		return matrix3;
	}

	public static void inRaKetQua(int[][] matrix1, int[][] matrix2, int[][] matrix3, char op) {
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++)
				System.out.printf("%3d", matrix1[i][j]);
			if (i == matrix1.length / 2)
				System.out.print("   " + op + " ");
			else
				System.out.print("     ");
			for (int j = 0; j < matrix2.length; j++)
				System.out.printf("%3d", matrix2[i][j]);
			if (i == matrix1.length / 2)
				System.out.print("   = ");
			else
				System.out.print("     ");
			for (int j = 0; j < matrix3.length; j++)
				System.out.printf("%3d", matrix3[i][j]);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao n: ");
		int soHang = sc.nextInt();
		int[][] matrix1 = creatMatrix(soHang);
		System.out.println();
		print(matrix1);
		int[][] matrix2 = creatMatrix(soHang);
		System.out.println();
		print(matrix2);
		System.out.println("cong hai matrix");
		int[][] matrix3 = nhanMatrix(matrix1, matrix2, soHang);
		System.out.println("In ra ket qua: ");
		inRaKetQua(matrix1, matrix2, matrix3, '*');
	}
}
