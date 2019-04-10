package tuan8_2_stack;

public class Stack {
	private int size;
	private int top;
	private char[] values;

	public Stack(int size) {
		this.size = size;
		values = new char[size];
		top = -1;
	}

	public void push(char data) {
		if (!isFull()) {
			top++;
			values[top] = data;
		}
	}
	public char peek()
	{
		return values[top--];
	}
	public boolean isFull() {
		if (top < size - 1) {
			return false;
		} else {
			return true;
		}
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

	public char pop() {
		char retVal = ' ';
		if (!isEmpty()) {
			retVal = values[top];
			top--;
		}
		return retVal;
	}

	public char stackTop() {
		int temp = top;
		char retVal = ' ';
		if (!isEmpty()) {
			retVal = values[temp];
			temp--;
		}
		return retVal;
	}

public int precedence(char it) {
	if(it == '*' || it == '^') return 6;

	else if(it == '/') return 5;

	else if(it == '%') return 4;

	else if(it == '+') return 3;

	else if(it == '-') return 2;
    
	else 		return 1; }

	public String convert(String in_put) {
		StringBuffer postfix = new StringBuffer(in_put.length());
		int i = 0;
		char c;
		String word = " ";
		while (i < in_put.length()) {
			c = in_put.charAt(i);
			if (Character.isDigit(c))
				postfix.append(c).append(" ");
			if (c == '(')
				push('(');
			if (c == '*' || c == '/' || c == '%' || c == '+' || c == '-') {
				char v = stackTop();
				if (v == '*' || v == '/' || v == '%' || v == '+' || v == '-') {
					if (precedence(v) >= precedence(c)) {
						{
							postfix.append(pop()).append(" ").toString();
						}
					}
				}
				push(c);
			}
			if (c == ')') {
				char st = stackTop();
				while (st != '(' && !isEmpty()) {
					postfix.append(pop()).append(" ").toString();
					st = stackTop();
				}
				pop();
			}
			i++;
		}
		return postfix.toString();
	}// end of inner while(token)

	public void print() {
		char temp = values[top];
		System.out.println("Stack content");
		while (!isEmpty()) {
			System.out.println("\n" + temp);
			temp = values[top--];
		}
	}
}
