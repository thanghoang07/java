package week2;

import java.util.Scanner;

public class Fib {
	public static int calc_fib(int n) {
		if (n > 45 || n < 0) {
			return 0;
		} else {
			int[] arrf = new int[100];

			arrf[0] = 0;
			arrf[1] = 1;

			for (int i = 2; i <= n; i++) {
				arrf[i] = arrf[i - 1] + arrf[i - 2];
			}
			return arrf[n];
		}
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		System.out.println(calc_fib(n));
		
	}
}
