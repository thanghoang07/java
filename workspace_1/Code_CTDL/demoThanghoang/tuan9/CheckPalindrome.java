package tuan9;

import java.util.Scanner;

public class CheckPalindrome {
	private static Scanner nhapVao;

	public static void main(String[] args) {
		System.out.println("nhap vao: ");
		nhapVao = new Scanner(System.in);
		String wort = nhapVao.nextLine();
		// String wort = "reliefpfpfeiller";
		char[] warray = wort.toCharArray();
		System.out.println("1" + istPalindrom(warray));
		System.out.println("2" + isPalindrome(wort));
	}

	/*
	 * public static boolean istPalindrom(char[] wort) { boolean palindrom =
	 * false; if (wort.length % 2 == 0) { for (int i = 0; i < wort.length / 2 -
	 * 1; i++) { if (wort[i] != wort[wort.length - i - 1]) { return false; }
	 * else { palindrom = true; } } } else { for (int i = 0; i < (wort.length -
	 * 1) / 2 - 1; i++) { if (wort[i] != wort[wort.length - i - 1]) { return
	 * false; } else { palindrom = true; } } } return palindrom; }
	 */
	public static boolean istPalindrom(char[] wort) {
		if (wort.length % 2 == 0) {
			for (int i = 0; i < wort.length / 2 - 1; i++) {
				if (wort[i] != wort[wort.length - i - 1]) {
					return false;
				}
			}
		} else {
			for (int i = 0; i < (wort.length - 1) / 2 - 1; i++) {
				if (wort[i] != wort[wort.length - i - 1]) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean isPalindrome(String abc) {
		if (abc != null && abc.length() > 0) 
		{
			char[] arr = abc.toCharArray();
			for (int i = 0; i < arr.length / 2; i++)
			{
				if (arr[i] != arr[arr.length - 1 - i]) 
				{
					return false;
				}
			}
			return true;
		}
		return false;
	}

}
