package lab2_by_thanh_hai;

public class IntegerMatrix2 extends Matrix2<Integer> {
	protected Integer add(Integer i1, Integer i2) {
		return i1 + i2;
	}

	protected Integer multiply(Integer i1, Integer i2) {
		return i1 * i2;
	}

	protected Integer zero() {
		return 0;
	}
}
