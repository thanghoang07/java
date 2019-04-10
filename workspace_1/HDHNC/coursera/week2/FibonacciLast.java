package week2;
import java.util.Scanner;

public class FibonacciLast {
	public static int last_fib(long n) {
		int a = 0, b = 1, temp;
		for (int i = 1; i < n; i++) {
			temp = b;
			b = (b + a) % 10;
			a = temp % 10;
		}
		return b;
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();

		System.out.println(last_fib(n));
	}
}
