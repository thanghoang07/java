package lab5_stack_by_thang_hoang;

import java.io.IOException;
import java.util.Scanner;

public class Bai5 
{
	private static Scanner nhapVao;

	public static void main(String[] args) throws IOException 
	{
		nhapVao = new Scanner(System.in);
		System.out.println("nhap vao bieu thuc infix: ");
		String nhap = nhapVao.nextLine();
		InToPost theTrans = new InToPost(nhap);
		System.out.println("bieu thuc infix la: " + nhap);
		System.out.println("bieu thuc postfix la: " + theTrans.chuyenTuInSangPost());		
	}
}
/*import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Bai5 
{
	public static String convertToPostfix(String input)
	{
		StringBuilder output = new StringBuilder();
		String[] tokens = input.split(" ");
		ArrayStack<String> theStack = new ArrayStack<String>(input.length());
//
//		Scanner input = new Scanner(infix);

		for (String token : tokens) 
		{
			if (token.equals("("))
			{
				theStack.push(token);
			} 
			else if (token.equals(")")) 
			{
				while (!(theStack.top().equals("(")) 
						&& !(theStack.isEmpty()))
				{
					output.append(theStack.pop());
				}
				if (theStack.top().equals("("))
				{
					theStack.pop();
				}
			} 
			else if (isOperator(token))
			{
				if (theStack.isEmpty())
					theStack.push(token);
				else 
				{
					if (doUuTien(token) <= doUuTien(theStack.top()))
					{
						output.append(theStack.pop());
						theStack.push(token);
					} 
					else
						theStack.push(token);
				}
			} 
			else
				output.append(token);
		}
		while (!theStack.isEmpty())
		{
			output.append(theStack.pop());
		}
		return output.toString();
	}

	public static boolean isOperator(String token)
	{
		return (token.equals("+") 
				|| token.equals("-") 
				|| token.equals("*") 
				|| token.equals("/") 
				|| token.equals("^"));
	}

	public static int doUuTien(String token) 
	{
		int precedence = 0;
		if (token.equals("*") || token.equals("/"))
			precedence = 2;
		else if (token.equals("+") || token.equals("-"))
			precedence = 1;
		return precedence;
	}

	public static void main(String[] args) {
		Scanner nhapVao = new Scanner(System.in);
		System.out.println("nhap vao bieu thuc: ");
		String nhap = nhapVao.nextLine();
		String a = "2 + (4 + 3 * 2 + 1) / 3";
//		String tokens[];
//		tokens = a.split(" ");
//		for (String token : tokens) {
//            System.out.println(token);
//        }1 + ((2 * 2) * 3 - 4) / 5 
		System.out.println(a);
		System.out.println(convertToPostfix(a));
	}
}

*/