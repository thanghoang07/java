package lab6_by_Van_Toan;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap chuoi ky tu: ");
		String s = in.nextLine();

		System.out.println(IsPalindrome.isPal(s) ? "La palindrome" : "Khong phai la palindrome");
	}
}
