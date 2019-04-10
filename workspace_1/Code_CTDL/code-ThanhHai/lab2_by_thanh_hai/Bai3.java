package lab2_by_thanh_hai;

public class Bai3 {
	public static void main(String[] args) {
	Rational r2 = new Rational(4,3);
	Rational r1 = new Rational(1,2);
	System.out.println(r1 + " + "+ r2 + " = "+ r1.add(r2));
	System.out.println(r1 + " - "+ r2 + " = "+ r1.subtract(r2) );
	System.out.println(r1 + " * "+ r2 + " = "+ r1.multiply(r2) );
	System.out.println(r1 + " / "+ r2 + " = "+ r1.divide(r2));
	System.out.println(r2 + " la "+ r2.doubleValue() );
	}
}
