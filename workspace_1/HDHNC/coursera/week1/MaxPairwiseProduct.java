package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MaxPairwiseProduct {
	static long getMaxPairwiseProduct(int[] numbers) {
		long result = 0;
		int n = numbers.length;
		for (int i = 0; i < n; ++i) {
			for (int j = i + 1; j < n; ++j) {
				if ((long) numbers[i] * numbers[j] > result) {
					result = ((long) numbers[i]) * numbers[j];
				}
			}
		}
		return result;
	}

	static long getMaxPairwiseProductFast(int[] numbers) {
		int maxResult1 = -3, maxResult2 = -3;
		int n = numbers.length;
		if (!(n >= 2 && n <= (2 * Math.pow(10, 5)))) {
			return 0;
		} else {
			for (int i = 0; i < n; i++) {
				if ((maxResult1 == -3) || (numbers[i] > numbers[maxResult1])) {
					maxResult1 = i;
				}
			}
			for (int j = 0; j < n; j++) {
				if ((j != maxResult1) && (maxResult2 == -3 || (numbers[j] > numbers[maxResult2]))) {
					maxResult2 = j;
				}
			}
		}
		//System.out.printf("index max fast: %d || %d\n", maxResult1, maxResult2);
		return ((long) numbers[maxResult1] * numbers[maxResult2]);
	}

	public static void main(String[] args) {
		while (true) {
			Random abc = new Random();
			int n = abc.nextInt(10);
			int[] numbers = new int[n];
			for (int i = 0; i < n; i++) {
				numbers[i] = abc.nextInt(10);
			}
			for (int i = 0; i < n; i++) {
				System.out.printf(" %d ", numbers[i]);
			}
			System.out.println();
			long res1 = getMaxPairwiseProduct(numbers);
			long res2 = getMaxPairwiseProductFast(numbers);
			if (res1 != res2) {
				System.out.printf("Wrong answer: %d || fast: %d\n", res1, res2);
				break;
			} else {
				System.out.printf("Ok: %d || fast: %d\n", res1, res2);
			}
		}
//		FastScanner sc = new FastScanner(System.in);
//		int n = sc.nextInt();
//		int[] numbers = new int[n];
//		for (int i = 0; i < numbers.length; i++) {
//			numbers[i] = sc.nextInt();
//		}
//		System.out.println(getMaxPairwiseProductFast(numbers));
	}
}

class FastScanner {
	BufferedReader br;
	StringTokenizer st;

	FastScanner(InputStream stream) {
		try {
			br = new BufferedReader(new InputStreamReader(stream));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	String next() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}

	int nextInt() {
		return Integer.parseInt(next());
	}
}
