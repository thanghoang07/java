package lab2_by_thanh_hai;

//import java.util.Random;

public class DoubleMatrix2 extends Matrix2<Double> {

	protected Double add(Double d1, Double d2) {
		return d1 + d2;
	}

	protected Double multiply(Double d1, Double d2) {
		return d1 * d2;
	}

	protected Double zero() {
		return 0.0;
	}

}
