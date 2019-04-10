package lab4_by_thanh_hai;

import java.util.*;

public class Bai12 {
	static boolean c[], h[], cc[], cp[];
	static int n, x[], soCach = 0;
	private static Scanner nhapVao;
	public static void Try(int i) {
		for (int j = 1; j <= n; ++j) {
			if (!h[j] && !c[i] && !cc[j - i + n] && !cp[i + j]) {
				x[i] = j;
				if (i < n) {
					h[j] = true;
					c[i] = true;
					cc[j - i + n] = true;
					cp[i + j] = true;
					Try(i + 1);
					h[j] = false;
					c[i] = false;
					cc[j - i + n] = false;
					cp[i + j] = false;
				} else {
					++soCach;
					System.out.print("Cach " + soCach + ": ");
					for (int l = 1; l < x.length; ++l)
						System.out.print(x[l] + " ");
					System.out.println();
				}
			}
		}
	}

	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		System.out.print("-Nhap n = ");
		n = nhapVao.nextInt();
		c = new boolean[n + 1];
		h = new boolean[n + 1];
		cc = new boolean[2 * n + 1];// -n..n; 0 ..2n
		cp = new boolean[2 * n + 1]; // 2 .. 2n
		x = new int[n + 1];
		Try(1);
	}
}
