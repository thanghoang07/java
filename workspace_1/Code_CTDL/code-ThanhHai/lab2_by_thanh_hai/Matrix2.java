package lab2_by_thanh_hai;

/*import java.util.Random;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;*/



public abstract class Matrix2<T extends Number> {
	protected abstract T add(T t1, T t2);

	protected abstract T multiply(T t1, T t2);

	protected abstract T zero();

	public T[][] addMatrix(T[][] matrix1, T[][] matrix2) {
		T[][] result = (T[][]) new Number[matrix1.length][matrix1[0].length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = add(matrix1[i][j], matrix2[i][j]);
			}
		}
		return result;
	}

	public T[][] multiplyMatrix(T[][] matrix1, T[][] matrix2) {
		T[][] result = (T[][]) new Number[matrix1.length][matrix1[0].length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				result[i][j] = zero();
				for (int k = 0; k < result[0].length; k++) {
					result[i][j] = add(result[i][j],
							multiply(matrix1[i][k], matrix2[k][j]));
				}
			}
		}
		return result;
	}

	public static void printResult(Number[][] m1, Number[][] m2, Number[][] m3,
			char op) {
		for (int i = 0; i < m1.length; i++) {
			// 1. In ma tran 1
			for (int j = 0; j < m1[i].length; j++) {
				System.out.printf("%6.2f", m1[i][j]);
			}

			// 2. In dau
			if (i == m1.length / 2) {
				System.out.print("   " + op + "");
			} else {
				System.out.print("    ");
			}
			// 3. In ra ma tran 2
			for (int j = 0; j < m2[i].length; j++) {
				System.out.printf("%6.2f", m2[i][j]);
			}
			// 4. In ra dau =
			if (i == m1.length / 2) {
				System.out.print("  = ");
			} else {
				System.out.print("    ");
			}
			// 5. In ra ma tran ket qua
			for (int j = 0; j < m3.length; j++) {
				System.out.printf("%6.2f", m3[i][j]);
			}
			// 6. Xuong dong
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
	}
	
}