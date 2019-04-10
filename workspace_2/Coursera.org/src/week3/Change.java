package week3;

import java.util.Scanner;

public class Change {
	private static int getChange(int n) {
		int ans = 0;
		if (n >= 10) {
			ans += n / 10;
			// System.out.println(n);
			n %= 10;
			// System.out.println(n);
		}
		if (n >= 5) {
			ans += n / 5;
			// System.out.println(n);
			n %= 5;
			// System.out.println(n);
		}
		ans += n;
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(getChange(n));
	}
}
