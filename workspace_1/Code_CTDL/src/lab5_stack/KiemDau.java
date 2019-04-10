package lab5_stack;

import java.util.Scanner;

public class KiemDau 
{
	private static final char L_PAREN = '(';
	private static final char R_PAREN = ')';
	private static final char L_BRACE = '{';
	private static final char R_BRACE = '}';
	private static final char L_BRACKET = '[';
	private static final char R_BRACKET = ']';

	public static boolean isBalanced(String s)
	{
		ArrayStack<Character> stack = new ArrayStack<Character>(10);
		for (int i = 0; i < s.length(); i++) 
		{

			if (s.charAt(i) == L_PAREN)
				stack.push(L_PAREN);

			else if (s.charAt(i) == L_BRACE)
				stack.push(L_BRACE);

			else if (s.charAt(i) == L_BRACKET)
				stack.push(L_BRACKET);

			else if (s.charAt(i) == R_PAREN) 
			{
				if (stack.isEmpty())
					return false;
				if (stack.pop() != L_PAREN)
					return false;
			}

			else if (s.charAt(i) == R_BRACE)
			{
				if (stack.isEmpty())
					return false;
				if (stack.pop() != L_BRACE)
					return false;
			}

			else if (s.charAt(i) == R_BRACKET)
			{
				if (stack.isEmpty())
					return false;
				if (stack.pop() != L_BRACKET)
					return false;
			}

			// ignore all other characters

		}
		return stack.isEmpty();
	}

	public static void main(String[] args)
	{
		System.out.println("nhap vao: ");
		Scanner nhapVao = new Scanner(System.in);
		String s = nhapVao.nextLine();
		System.out.println(isBalanced(s));
	}

}
