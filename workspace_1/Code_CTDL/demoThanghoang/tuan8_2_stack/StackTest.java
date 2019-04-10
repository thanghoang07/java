package tuan8_2_stack;

import java.io.*;
import java.io.IOException;
import java.util.*;



public class StackTest {
	public static void main(String[] args) {
		String input = "";
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );

		System.out.println("Enter infix expression operators(+-*/% and diqits(0-9): ");
		try{
			input = dataIn.readLine();
		}catch(IOException w){
			System.out.println("Error" + w);
		}
		input = input + ')';
		Stack stack = new Stack(input.length());
		stack.push('(');
		
		String post = stack.convert(input);
		StringTokenizer output = new StringTokenizer(post);
		System.out.println("\n postfix expression: ");
		
		while(output.hasMoreTokens())
		{
			System.out.println(output.nextToken() + "");
		}
		Evaluator_Postfix evaluate = new Evaluator_Postfix(post.length());
		
		int answer = evaluate.produce(post);
		System.out.println("\n Result: ");
		
		System.exit(0);
	}
}
