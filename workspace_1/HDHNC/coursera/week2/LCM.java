package week2;
import java.util.Scanner;

public class LCM {
	private static long gCD(int m, int n) {
		if (n == 0)
			return m;
		else
			return gCD(n, m % n);
	}

	private static long lCM(int a, int b) {
		long temp = 0;
		temp = (((long) a * b) / (gCD(a, b)));
		return temp;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		// System.out.println(gcd(a, b));
		System.out.println(lCM(a, b));
	}
}
