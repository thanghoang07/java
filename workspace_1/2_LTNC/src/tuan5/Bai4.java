package tuan5;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" ");
		int a = sc.nextInt();
		int count = 0;
		for (int i = ((a - 1) / 2); i > 0; i--) {
			count++;
		}
		System.out.println(count);
	}
}
