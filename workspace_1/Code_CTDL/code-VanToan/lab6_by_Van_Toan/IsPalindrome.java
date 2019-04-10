package lab6_by_Van_Toan;

import lab5_by_Van_Toan.ArrayStack;

public class IsPalindrome {
	public static boolean isPal(String str) {
		ArrayStack<Character> stack = new ArrayStack<Character>(str.length());
		ArrayQueue<Character> queue = new ArrayQueue<Character>();

		Character ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.toLowerCase().charAt(i);
			queue.enqueue(ch);
			stack.push(ch);
		}
		//so sanh ky tu 
		while (!queue.isEmpty()) {
			if (!queue.dequeue().equals(stack.pop()))
				return false;
		}
		return true;
	}
}
