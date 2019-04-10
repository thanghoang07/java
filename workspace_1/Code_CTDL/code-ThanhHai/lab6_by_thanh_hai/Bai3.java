package lab6_by_thanh_hai;

import java.util.Scanner;

public class Bai3 {
	public static void main(String args[]) {
		Palindrome palindrom = new Palindrome();
		Scanner scan = new Scanner(System.in);
		String line;
		do {
			System.out.print("Nhap chuoi ky tu: ");
			line = scan.nextLine();
			if (palindrom.isPalindrome(line))
				System.out.println("\nDong van ban la mot palindrome.");
			else
				System.out.println("\nDong van ban khong la mot palindrome.");
		} while (line.length() != 0);
	}
}
