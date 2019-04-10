package lab2_by_thanh_hai;

public class Rational extends Number implements Comparable {
	private long numerator = 0;
	private long denominator = 1;

	public Rational() {
		this(0, 1);
	}

	public long isDenominatorNegative() {
		if (denominator > 0)
			denominator = 1;
		else
			denominator = -1;
		return denominator;
	}

	public Rational(long numerator, long denominator) {
		long gcd = gcd(numerator, denominator);
		this.numerator = isDenominatorNegative() * numerator / gcd;
		this.denominator = Math.abs(denominator) / gcd;
	}

	private static long gcd(long n, long d) {
		long n1 = Math.abs(n);
		long n2 = Math.abs(d);
		int gcd = 1;

		for (int k = 1; k <= n1 && k <= n2; k++) {
			if (n1 % k == 0 && n2 % k == 0)
				gcd = k;
		}
		return gcd;
	}

	public long getNumerator() {
		return numerator;
	}

	public long getDenominator() {
		return denominator;
	}

	public Rational add(Rational secondRational) {
		long n = numerator * secondRational.getDenominator() + denominator
				* secondRational.getNumerator();
		long d = denominator * secondRational.getDenominator();
		return new Rational(n, d);
	}

	public Rational subtract(Rational secondRational) {
		long n = numerator * secondRational.getDenominator() - denominator
				* secondRational.getNumerator();
		long d = denominator * secondRational.getDenominator();
		return new Rational(n, d);
	}

	public Rational multiply(Rational secondRational) {
		long n = numerator * secondRational.getNumerator();
		long d = denominator * secondRational.getDenominator();
		return new Rational(n, d);
	}

	public Rational divide(Rational secondRational) {
		long n = numerator * secondRational.getDenominator();
		long d = denominator * secondRational.getNumerator();
		return new Rational(n, d);
	}

	public String toString() {
		if (numerator == 0)
			return 0 + "";
		if (denominator == 1)
			return numerator + "";
		else
			return numerator + "/" + denominator;
	}
	public boolean equals(Object parm1) {
		if ((this.subtract((Rational) (parm1))).getNumerator() == 0) {
			return true;
		} else {
			return false;
		}
	}


	public int compareTo(Object obj) {
		if ((this.subtract((Rational) obj)).getNumerator() > 0) {
			return 1;
		} else if ((this.subtract((Rational) obj)).getNumerator() < 0) {
			return -1;
		} else {
			return 0;
		}

	}

	public double doubleValue() {
		return 0;
	}

	public float floatValue() {
		return 0;
	}

	public int intValue() {
		return 0;
	}

	public long longValue() {
		return 0;
	}
}
