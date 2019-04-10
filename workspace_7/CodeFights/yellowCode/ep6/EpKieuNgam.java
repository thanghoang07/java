package ep6;

/**
 * @author thang
 *
 */
public class EpKieuNgam {
	public static void main(String[] args) {
		byte i = 100;
		short j = i;
		int k = j;
		long l = k;
		float m = l;
		double n = m;

		System.out.println("This is a byte: " + i);
		System.out.println("This is a short: " + j);
		System.out.println("This is a int: " + k);
		System.out.println("This is a long: " + l);
		System.out.println("This is a float: " + m);
		System.out.println("This is a double: " + n);
	}
}
