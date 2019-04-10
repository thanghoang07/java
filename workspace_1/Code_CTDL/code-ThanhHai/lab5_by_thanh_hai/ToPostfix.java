package lab5_by_thanh_hai;

public class ToPostfix {
	public static int postFix(String s) {
		int result;
		ArrayStack<Integer> stack = new ArrayStack<>(80);
		for (int i = 0; i < s.length(); i++) {
			char ch;
			if (s.charAt(i) == ' ')
				throw new RuntimeException("Chuoi nhap vao viet lien khong khoang cach");
			ch = s.charAt(i);
			int intChar = ch - '0';

			if (intChar >= 0 && intChar <= 9) {
				stack.push(intChar);
			} else {

				int operator1 = stack.pop();
				int operator2 = stack.pop();

				switch (ch) {

				case '+':
					result = operator1 + operator2;
					stack.push(result);
					break;

				case '-':
					result = operator2 - operator1;
					stack.push(result);
					break;

				case '*':
					result = operator1 * operator2;
					stack.push(result);
					break;
				case '/':
					result = operator2 / operator1;
					stack.push(result);
					break;
				}

			}
		}
		int finalResult = stack.pop();
		return finalResult;
	}
}
