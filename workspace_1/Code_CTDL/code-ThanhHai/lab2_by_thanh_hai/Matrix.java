package lab2_by_thanh_hai;

/*import java.util.Random;
import java.util.Scanner;*/

import lab2_by_thanh_hai.Matrix;

public class Matrix {

	// ham tinh tong
	public int[][] sum(int[][] m1, int[][] m2) {
		int[][] result = new int[m1.length][m1[0].length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = m1[i][j] + m2[i][j];
			}
		}
		return result;
	}

	// ham tinh tich
	public int[][] multi(int[][] a, int[][] b) {
		int[][] result = new int[a.length][a[0].length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = 0;
				for (int k = 0; k < result.length; k++) {
					result[i][j] += a[i][k] * b[k][j];

				}
			}
		}
		return result;
	}

	public void printResult(int[][] m1, int[][] m2, int[][] m3, char op) {
		for (int i = 0; i < m1.length; i++) {
			// 1.in ma tran 1
			for (int j = 0; j < m1[i].length; j++) {
				System.out.print("  " + m1[i][j]);
			}

			// 2. In dau + - * /
			if (i == m1.length / 2) {
				System.out.print("  " + op + "");
			} else {
				System.out.print("   ");
			}
			// 3. In ra ma tran 2
			for (int j = 0; j < m2[i].length; j++) {
				System.out.print("  " + m2[i][j]);
			}
			// 4. In ra dau =
			if (i == m1.length / 2) {
				System.out.print(" = ");
			} else {
				System.out.print("   ");
			}
			// 5. In ra ma tran ket qua
			for (int j = 0; j < m3.length; j++) {
				System.out.print(m3[i][j] + "  ");
			}
			// 6. Xuong dong
			System.out.println("  ");
		}
	}

	public static String toString(int[][] a) {
		String str = "";
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				str = str + a[i][j] + " ";
			}
			str += "\n";
		}
		return str;
	}

}
