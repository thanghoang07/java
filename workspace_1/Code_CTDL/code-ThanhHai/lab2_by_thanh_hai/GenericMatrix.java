package lab2_by_thanh_hai;

public abstract class GenericMatrix<E extends Number> {
	protected abstract E add(E e1, E e2);

	protected abstract E multiply(E e1, E e2);

	protected abstract E zero();

	public E[][] addMatrix(E[][] matrix1, E[][] matrix2) {
		E[][] result = (E[][]) new Number[matrix1.length][matrix2[0].length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = add(matrix1[i][j], matrix2[i][j]);
			}
		}
		return result;
	}

	public E[][] multiplyMatrix(E[][] matrix1, E[][] matrix2) {
		E[][] result = (E[][]) new Number[matrix1.length][matrix2[0].length];
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
			// 1.in ma tran 1
			for (int j = 0; j < m1[0].length; j++) {
				System.out.print("  " + m1[i][j]);
			}

			// 2. In dau + - * /
			if (i == m1.length / 2) {
				System.out.print("  " + op + " ");
			} else {
				System.out.print("    ");
			}
			// 3. In ra ma tran 2
			for (int j = 0; j < m2.length; j++) {
				System.out.print(m2[i][j] + "  ");
			}
			// 4. In ra dau =
			if (i == m1.length / 2) {
				System.out.print(" =  ");
			} else {
				System.out.print("    ");
			}
			// 5. In ra ma tran ket qua
			for (int j = 0; j < m3.length; j++) {
				System.out.print(m3[i][j] + "  ");
			}
			// 6. Xuong dong
			System.out.println();
		}
	}

}
