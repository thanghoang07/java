package lab5_by_Van_Toan;

public class MathGroupSymbol {
	public static boolean isGroupingSymbols(String s) {
		ArrayStack<Character> stack = new ArrayStack<Character>(15);
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '(')
				stack.push('(');

			else if (s.charAt(i) == '{')
				stack.push('{');

			else if (s.charAt(i) == '[')
				stack.push('[');

			else if (s.charAt(i) == ')') {
				if (stack.isEmpty())
					return false;
				if (stack.pop() != '(')
					return false;
			}

			else if (s.charAt(i) == '}') {
				if (stack.isEmpty())
					return false;
				if (stack.pop() != '{')
					return false;
			}

			else if (s.charAt(i) == ']') {
				if (stack.isEmpty())
					return false;
				if (stack.pop() != '[')
					return false;
			}
		}
		return stack.isEmpty();
	}
}
