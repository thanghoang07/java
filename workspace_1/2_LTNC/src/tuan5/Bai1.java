package tuan5;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" ");
		int a = sc.nextInt();
		System.out.print((a < 10000000) ? (a + a) : (false));
	}
}
