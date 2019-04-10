package tuan13_1;

import java.util.Scanner;

public class SubSetGenerator {

	public static void maskGen(int[] set, int aSize) {
		int head = 0;
		int[] tail;
		tail = new int[20];
		// base case
		if (aSize == 0)
			System.out.println("{}");
		else {
			head = set[0];
			for (int i = 1; set[i] > 0; i++)
				tail[i - 1] = set[i];
		}

	} // end maskGen

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int[] aSet;
		aSet = new int[20];
		int aSize = 0; // == n

		// take input for A and B set
		System.out.print("Please enter the size of A: ");
		aSize = scan.nextInt();

		System.out.print("Please enter A: ");
		for (int i = 0; i < aSize; i++)
			aSet[i] = scan.nextInt();

		System.out.println("Subsets: ");
		maskGen(aSet, aSize);

	} // end main

}
