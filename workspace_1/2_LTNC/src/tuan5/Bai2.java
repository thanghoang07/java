package tuan5;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" ");
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		System.out.println((a < 100 && b < 100 && c < 100) ? ((a - b) * c) : (false));
	}
}
