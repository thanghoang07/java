package lab5;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap vao n : ");
		int n = in.nextInt();

		int[][] array = new int[n][];
		fillIn(array);
		printArray(array);
	}

	public static void fillIn(int[][] triangle) {
		for (int i = 0; i < triangle.length; i++) {
			triangle[i] = new int[i + 1];
			triangle[i][0] = 1;
			triangle[i][i] = 1;
			for (int j = 1; j < i; j++) {
				triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
			}
		}
	}

	public static void printArray(int[][] triangle) {
		for (int i = 0; i < triangle.length; i++) {
			for (int j = 0; j < triangle[i].length; j++) {
				System.out.print(triangle[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
