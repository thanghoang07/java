package javaBasic_0;

	public class Rational1 extends Number implements Comparable {
		  // Data fields for numerator and denominator
		  private long numerator = 0;
		  private long denominator = 1;

		  /** Construct a rational with default properties */
		  public Rational1() {
		    this(0, 1);
		  }

		  /** Construct a rational with specified numerator and denominator */
		  public Rational1(long numerator, long denominator) {
		    long gcd = gcd(numerator, denominator);
		    this.numerator = ((denominator > 0) ? 1 : -1) * numerator / gcd;
		    this.denominator = Math.abs(denominator) / gcd;
		  }

		  /** Find GCD of two numbers */
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

		  /** Return numerator */
		  public long getNumerator() {
		    return numerator;
		  }

		  /** Return denominator */
		  public long getDenominator() {
		    return denominator;
		  }

		  /** Add a rational number to this rational */
		  public Rational1 add(Rational secondRational) {
		    long n = numerator * secondRational.getDenominator() +
		      denominator * secondRational.getNumerator();
		    long d = denominator * secondRational.getDenominator();
		    return new Rational1(n, d);
		  }

		  /** Subtract a rational number from this rational */
		  public Rational1 subtract(Rational secondRational) {
		    long n = numerator * secondRational.getDenominator()
		      - denominator * secondRational.getNumerator();
		    long d = denominator * secondRational.getDenominator();
		    return new Rational1(n, d);
		  }

		  /** Multiply a rational number to this rational */
		  public Rational1 multiply(Rational secondRational) {
		    long n = numerator * secondRational.getNumerator();
		    long d = denominator * secondRational.getDenominator();
		    return new Rational1(n, d);
		  }

		  /** Divide a rational number from this rational */
		  public Rational1 divide(Rational secondRational) {
		    long n = numerator * secondRational.getDenominator();
		    long d = denominator * secondRational.numerator;
		    return new Rational1(n, d);
		  }

		  /** Override the toString() method */
		  public String toString() {
		    if (denominator == 1)
		      return numerator + "";
		    else
		      return numerator + "/" + denominator;
		  }

		  /** Override the equals method in the Object class */
		  public boolean equals(Object parm1) {
		    if ((this.subtract((Rational)(parm1))).getNumerator() == 0)
		      return true;
		    else
		      return false;
		  }

		  /** Override the hashCode method in the Object class */
		  public int hashCode() {
		    return new Double(this.doubleValue()).hashCode();
		  }

		  /** Override the abstract intValue method in java.lang.Number */
		  public int intValue() {
		    return (int)doubleValue();
		  }

		  /** Override the abstract floatValue method in java.lang.Number */
		  public float floatValue() {
		    return (float)doubleValue();
		  }

		  /** Override the doubleValue method in java.lang.Number */
		  public double doubleValue() {
		    return numerator * 1.0 / denominator;
		  }

		  /** Override the abstract longValue method in java.lang.Number */
		  public long longValue() {
		    return (long)doubleValue();
		  }

		  /** Override the compareTo method in java.lang.Comparable */
		  public int compareTo(Object o) {
		    if ((this.subtract((Rational)o)).getNumerator() > 0)
		      return 1;
		    else if ((this.subtract((Rational)o)).getNumerator() < 0)
		      return -1;
		    else
		      return 0;
		  }

		  public Rational1 increase() {
		    return this.add(new Rational(1, 1));
		  }
		}
	
	

