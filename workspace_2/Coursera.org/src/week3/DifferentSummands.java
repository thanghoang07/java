package week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DifferentSummands {

	// private static List<Integer> optimalSummands(int n) {
	// List<Integer> summands = new ArrayList<Integer>();
	//
	// int i = 1;
	//
	// while (true) {
	// if (n - i <= i) {
	// summands.add(n);
	// break;
	// }
	// summands.add(i);
	// n -= i;
	// i += 1;
	// }
	//
	// return summands;
	// }
	//
	// public static void main(String[] args) {
	// Scanner sc = new Scanner(System.in);
	// int n = sc.nextInt();
	// /*
	// * for (int i = 0; i < n + 1; i++) { System.out.println("========");
	// * List<Integer> summands = optimalSummands(i);
	// * System.out.println(summands.size()); for (Integer summand : summands)
	// * { System.out.printf("%d ", summand); }
	// * System.out.println("\n========"); }
	// */
	// List<Integer> summands = optimalSummands(n);
	// System.out.println(summands.size());
	// for (Integer summand : summands) {
	// System.out.printf("%d ", summand);
	// }
	// }
	private static List<Integer> optimalSummands(int n) {
		List<Integer> summands = new ArrayList<Integer>();
		int i = 1;
		while (n > 0) {
			if (n - i > i || n == i) {
				summands.add(i);
				n -= i;
				i++;
			} else if (n - i <= i)
				i++;
		}
		return summands;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Integer> summands = optimalSummands(n);
		System.out.println(summands.size());
		for (Integer summand : summands) {
			System.out.print(summand + " ");
		}
		scanner.close();
	}
}
