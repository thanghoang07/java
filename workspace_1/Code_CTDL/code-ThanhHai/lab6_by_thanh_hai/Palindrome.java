package lab6_by_thanh_hai;

/*import java.util.Scanner;
import lab5_by_thanh_hai.StackException;
*/
public class Palindrome {

	public static boolean isPalindrome(String str) {
		ArrayQueue<Character> queue = new ArrayQueue<Character>();
		ArrayStack<Character> stack = new ArrayStack<Character>(str.length());
		Character ch;

		for (int i = 0; i < str.length(); i++) {
			ch = str.toLowerCase().charAt(i);
			System.out.print(ch);
			queue.enqueue(ch);
			stack.push(ch);
		}
		// so sanh
		while (!queue.isEmpty()) {
			if (!queue.dequeue().equals(stack.pop()))
				return false;
		}
		return true;
	}

}
