package lab6_queue_by_thang_hoang;

import java.util.Scanner;

public class Bai3
{
	private static Scanner nhapVao;

	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		String line;
		do {
			System.out.print("nhap vao mot chuoi : ");
			line = nhapVao.nextLine();
			String line1 = line.toUpperCase();
			if(line.charAt(0) != line1.charAt(0))
			{
				if (Palindrome.isPalindrome(line))
					System.out.println("chuoi la palindrome.");
				else
					System.out.println("chuoi khong phai palindrome.");
			}
			else
			{
				System.out.println("chuyen sang chu thuong: " + Palindrome.convert(line));
				if (Palindrome.isPalindrome(line))
					System.out.println("chuoi la palindrome.");
				else
					System.out.println("chuoi khong phai palindrome.");
			}
		} while (line.length() != 0);
	}
}
