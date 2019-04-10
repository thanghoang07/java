package tuan8_stack;

import java.util.Stack;

public class StackReverse {

	public static void main(String[] args) {

		final String inputString = "code review";
		System.out.println("The string is: " + inputString);
		final String reversed = reverseString(inputString);
		System.out.println("The reversed string is " + reversed);
		
		
		Stack <Integer> stack = new Stack <Integer> ();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stackReversal(stack);
        while(stack.size() > 0)
        {
            System.out.println(stack.pop());
        }
	}

	public static String reverseString(String originalString) {
		Stack<Character> stack = new Stack<>();
		String reversed = "";
		for (int i = 0; i < originalString.length(); i++) {
			char ch = originalString.charAt(i);
			stack.push(ch);
		}
		for (int i = 0; i < originalString.length(); i++) {
			char ch = stack.pop();
			reversed = reversed + ch;

		}
		return reversed;

	}
	    public static void stackReversal(Stack<Integer> s)
	    {
	        if(s.size() == 0) return;
	        int n = getLast(s);
	        stackReversal(s);
	        s.push(n);
	    }
	 
	    public static int getLast(Stack<Integer> s)
	    {
	        int a = s.pop();
	        if(s.size() == 0)
	        {
	            return a;
	        }
	        else
	        {
	            int k = getLast(s);
	            s.push(a);
	            return k;
	        }
	    }
	

}
