package lab5;

import java.util.Random;
import java.util.Scanner;

public class Bai3 {
	public final static int MAX = 2;

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

	public static int[][] chuyenVi(int[][] matrix, int soHang) {
		int[][] matrix2 = new int[soHang][soHang];
		for (int i = 0; i < soHang; i++) {
			for (int j = 0; j < soHang; j++) {
				matrix2[j][i] = matrix[i][j];
			}
		}
		return matrix2;
	}

	public static void hoanVi(int[][] matrix, int soHang) {
		for (int i = 0; i < soHang; i++) {
			for (int j = 0; j < soHang / 2; j++) {
				int first = matrix[i][j];
				matrix[i][j] = matrix[i][soHang - j - 1];
				matrix[i][soHang - j - 1] = first;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap vao so canh cua matran vuong: ");
		int n = sc.nextInt();
		int[][] matrix = creatMatrix(n);
		print(matrix);
		System.out.println("chuyen vi");
		print(chuyenVi(matrix, n));
		System.out.println("hoan vi");
		hoanVi(matrix, n);
		print(matrix);
	}
}
