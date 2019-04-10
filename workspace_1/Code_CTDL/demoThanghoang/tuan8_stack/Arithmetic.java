package tuan8_stack;

import java.util.Scanner;
import java.util.Stack;
import java.util.EmptyStackException;

public class Arithmetic {
	int length;
	Stack stk;
	String exp, postfix;

	Arithmetic(String s) {
		stk = new Stack();
		exp = s;
		postfix = "";
		length = exp.length();
	}
	boolean isBalance() {
		boolean fail = false;
		int index = 0;

		try {
			while (index < length) {
				char ch = exp.charAt(index);

				switch (ch) {
				case ')':
					stk.pop();
					break;

				case '(':
					stk.push(new Character(ch));
					break;

				default:
					break;
				}
				index++;
			}
		} catch (EmptyStackException e) {
			fail = true;
		}
		return stk.empty() && !fail;
	}

	void postfixExpression() {
		String token = "";
		Scanner scan = new Scanner(exp);
		stk.clear();

		while (scan.hasNext()) {
			token = scan.next();
			char current = token.charAt(0);

			if (isNumber(token)) {
				postfix = postfix + token + " ";
			} else if (isParentheses(current)) {
				if (current == '(') {
					stk.push(current);
				} else {
					Character ch = (Character) stk.peek();
					char nextToken = ch.charValue();

					while (nextToken != '(') {
						postfix = postfix + stk.pop() + " ";

						ch = (Character) stk.peek();

						nextToken = ch.charValue();
					}
					stk.pop();
				}
			} else {
				if (stk.empty()) {
					stk.push(current);
				} else {
					Character ch = (Character) stk.peek();
					char top = ch.charValue();

					if (hasHigherPrecedence(top, current)) {
						stk.push(current);
					} else {
						ch = (Character) stk.pop();

						top = ch.charValue();

						stk.push(current);

						stk.push(top);
					}
				}
			}
		}
		try {
			Character ch = (Character) stk.peek();
			char nextToken = ch.charValue();

			while (isOperator(nextToken)) {
				postfix = postfix + stk.pop() + " ";
				ch = (Character) stk.peek();
				nextToken = ch.charValue();
			}
		} catch (EmptyStackException e) {
		}
	}

	boolean isNumber(String s) {
		try {
			int Num = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	void evaluateRPN() {
		Scanner scan = new Scanner(postfix);
		String token = "";
		stk.clear();

		while (scan.hasNext()) {
			try {
				token = scan.next();
				if (isNumber(token)) {
					stk.push(token);
				} else {
					char current = token.charAt(0);
					double t1 = Double.parseDouble(stk.pop().toString());
					double t2 = Double.parseDouble(stk.pop().toString());
					double t3 = 0;

					switch (current) {
					case '+': {
						t3 = t2 + t1;
						stk.push(t3);
						break;
					}
					case '-': {
						t3 = t2 - t1;
						stk.push(t3);
						break;
					}
					case '*': {
						t3 = t2 * t1;
						stk.push(t3);
						break;
					}
					case '/': {
						t3 = t2 / t1;
						stk.push(t3);
						break;
					}
					default: {
						System.out.println("Reverse Polish Notation was unable to be preformed.");
					}
					}
				}

			} catch (EmptyStackException e) {
			}
		}
	}

	String getResult() {
		return stk.toString();
	}

	int stackSize() {
		return stk.size();
	}

	boolean isParentheses(char current) {
		if ((current == '(') || (current == ')')) {
			return true;
		} else {
			return false;
		}
	}

	boolean isOperator(char ch) {
		if ((ch == '-')) {
			return true;
		} else if ((ch == '+')) {
			return true;
		} else if ((ch == '*')) {
			return true;
		} else if ((ch == '/')) {
			return true;
		} else {

		}
		return false;
	}

	boolean hasHigherPrecedence(char top, char current) {
		boolean HigherPre = false;

		switch (current) {
		case '*':
			HigherPre = true;
			break;

		case '/':
			HigherPre = true;
			break;

		case '+':

			if ((top == '*') || (top == '/') || (top == '-')) {
				HigherPre = false;
			} else {
				HigherPre = true;
			}

			break;

		case '-':
			if ((top == '*') || (top == '/') || (top == '-')) {
				HigherPre = false;
			} else {
				HigherPre = true;
			}
			break;

		default:
			System.out.println("Higher Precedence Unsuccessful was unable to be preformed.");
			break;
		}

		return HigherPre;
	}

	String getPostfix() {
		return postfix;
	}
	public static void main(String[] args) {
		
	}
}
