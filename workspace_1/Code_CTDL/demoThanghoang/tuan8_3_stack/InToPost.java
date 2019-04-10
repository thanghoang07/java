package tuan8_3_stack;

import java.io.IOException;
import java.util.Scanner;

public class InToPost {
	private ArrayStack<Character> theStack;
	private String input;
	private static String output = "";

	public InToPost(String in) {
		input = in;
		int stackSize = input.length();
		theStack = new ArrayStack(stackSize);
	}

	public String doTrans() {
		for (int j = 0; j < input.length(); j++) {
			char ch = input.charAt(j);
			switch (ch) {
			case '+':
			case '-':
				gotOper(ch, 1);
				break;
			case '*':
			case '/':
				gotOper(ch, 2);
				break;
			case '(':
				theStack.push(ch);
				break;
			case ')':
				gotParen(ch);
				break;
			default:
				output = output + ch;
				break;
			}
		}
		while (!theStack.isEmpty()) {
			output = output + theStack.pop();
		}
		System.out.println(output);
		return output;
	}

	public void gotOper(char opThis, int prec1) {
		while (!theStack.isEmpty()) {
			char opTop = theStack.pop();
			if (opTop == '(') {
				theStack.push(opTop);
				break;
			} else {
				int prec2;
				if (opTop == '+' || opTop == '-')
					prec2 = 1;
				else
					prec2 = 2;
				if (prec2 < prec1) {
					theStack.push(opTop);
					break;
				} else
					output = output + opTop;
			}
		}
		theStack.push(opThis);
	}

	public void gotParen(char ch) {
		while (!theStack.isEmpty()) {
			char chx = theStack.pop();
			if (chx == '(')
				break;
			else
				output = output + chx;
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner nhapVao = new Scanner(System.in);
		System.out.println("Enter the ....: ");
		String nhap = nhapVao.nextLine();
		InToPost theTrans = new InToPost(nhap);
		System.out.println("bieu thuc infix la: " + nhap);
		System.out.println("bieu thuc postfix la: " + theTrans.doTrans());
	}

}