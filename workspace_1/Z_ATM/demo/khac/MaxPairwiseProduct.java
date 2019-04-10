package khac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

//public class MaxPairwiseProduct {
//	public static int[] createArr(int n) {
//		int[] arr = new int[n];
//		Random abc = new Random();
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = abc.nextInt(20);
//		}
//		return arr;
//	}
//
//	public static void inArr(int[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			System.out.printf("%3d", arr[i]);
//		}
//		System.out.println();
//	}
//
//	public static int getMaxPairwiseProduct(int[] arr) {
//		int result = 0;
//		for (int i = 0; i < arr.length; ++i) {
//			for (int j = i + 1; j < arr.length; ++j) {
//				if (arr[i] * arr[j] > result) {
//					result = arr[i] * arr[j];
//				}
//			}
//		}
//		return result;
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] arr = createArr(n);
//		inArr(arr);		
//		System.out.println(getMaxPairwiseProduct(arr));
//	}
//}
public class MaxPairwiseProduct {
	public static int getMaxPairwiseProduct(int[] numbers) {
		int result = 0;
		int n = numbers.length;
		for (int i = 0; i < n; ++i) {
			for (int j = i + 1; j < n; ++j) {
				if (numbers[i] * numbers[j] > result) {
					result = numbers[i] * numbers[j];
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		FastScanner scanner = new FastScanner(System.in);
		int n = scanner.nextInt();
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		}
		System.out.println(getMaxPairwiseProduct(numbers));
	}
}

class FastScanner {
	BufferedReader br;
	StringTokenizer st;

	public FastScanner(InputStream stream) {
		try {
			br = new BufferedReader(new InputStreamReader(stream));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String next() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}
}