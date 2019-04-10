package lab5_stack;

import java.io.IOException;
import java.util.Scanner;

public class DaoChuoi 
{
	private static String output;
	private static Scanner nhapVao;

	public static String daoChuoi(String chuoi)
	{		
		ArrayStack<Character> arrStack = new ArrayStack<Character>(chuoi.length());
		for (int i = 0; i < chuoi.length(); i++) 
		{
			char ch = chuoi.charAt(i);
			arrStack.push(ch);
		}
		output = "";
		while (!arrStack.isEmpty())
		{
			char ch = arrStack.pop();
			output = output + ch;
		}
		return output;
	}

	public static void main(String[] args) throws IOException
	{
		nhapVao = new Scanner(System.in);
		System.out.println("nhap vao mot chuoi: ");
		String nhap = nhapVao.nextLine();
		System.out.println("chuoi: " + nhap);	
		System.out.println("dao: " + DaoChuoi.daoChuoi(nhap));
		
		/*String input = "Java Source and Support";
		String output;
		Reverse theReverser = new Reverse(input);
		output = theReverser.doRev();
		System.out.println("Reversed: " + output);*/
	}

	/*class Stack {
		private int maxSize;
		private char[] stackArray;
		private int top;

		public Stack(int max) {
			maxSize = max;
			stackArray = new char[maxSize];
			top = -1;
		}

		public void push(char j) {
			stackArray[++top] = j;
		}

		public char pop() {
			return stackArray[top--];
		}

		public char peek() {
			return stackArray[top];
		}

		public boolean isEmpty() {
			return (top == -1);
		}
	}
*/
}
