package lab6_queue;

import java.util.Scanner;

public class Palindrome {

	private static Scanner nhapVao;

	public static String convert(String str) {
		String result = "";
		for (char c : str.toCharArray()) {
			result += Character.toLowerCase(c);
		}
		return result;
	}

	public static boolean isPalindrome(String line) {
		ListQueue<Character> q = new ListQueue<Character>();
		ArrayStack<Character> s = new ArrayStack<Character>(10);
		Character letter; // One character from the input string
		//int mismatches = 0; // Number of spots that mismatched
		int i; // Index for the input string

		for (i = 0; i < line.length(); i++) {
			letter = line.charAt(i);

			if (Character.isLetter(letter)) {
				q.enqueue(letter);
				s.push(letter);
			}
		}
		// while (!q.isEmpty()) {
		// if (q.dequeue() != s.pop())
		// mismatches++;
		// }
		// return (mismatches == 0);
		while (!q.isEmpty()) {
			if (!q.dequeue().equals(s.pop()))
				return false;
		}
		return true;

	}

	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		String line;
		do {
			System.out.print("nhap vao mot chuoi : ");
			line = nhapVao.nextLine();
			String line1 = line.toUpperCase();
			if(line.charAt(0) != line1.charAt(0))
			{
				if (isPalindrome(line))
					System.out.println("chuoi la palindrome.");
				else
					System.out.println("chuoi khong phai palindrome.");
			}
			else
			{
				System.out.println("chuyen sang chu thuong: " + convert(line));
				if (isPalindrome(line))
					System.out.println("chuoi la palindrome.");
				else
					System.out.println("chuoi khong phai palindrome.");
			}
		} while (line.length() != 0);
	}
}
