package tuan8_2_stack;

import java.io.*;
import java.util.*;

public class Evaluator_Postfix {
	private int size;
	private int top;
	private int[] values;
	private int valEx;

	public Evaluator_Postfix(int size) {
		this.size = size;
		values = new int[size];
		top = -1;
	}

	public void push(int data) {
		if (!isFull()) {
			top++;
			values[top] = data;
		}
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

	public int pop() {
		int retVal = 0;
		if (!isEmpty()) {
			retVal = values[top];
			top--;
		}
		return retVal;
	}

	public int produce(String post_fix) {
		post_fix = post_fix + "\0";
		int i = 0;
		int ans;
		int x, y;
		while (i < post_fix.length()) {
			char c = post_fix.charAt(i);
			if (Character.isDigit(c)) {
				int l = (c - '0');
				push(l);
			}
			if (c == '*' || c == '/' || c == '%' || c == '+' || c == '-') {
				x = pop();
				y = pop();
				// calculating
				if (c == '*') {
					ans = x * y;
					push(ans);
				}
				if (c == '/') {
					if (x < y) {
						ans = y / x;
						push(ans);
					} else {
						ans = x / y;
						push(ans);
					}
				}
				if (c == '%') {
					ans = x % y;
					push(ans);
				}
				if (c == '+') {
					ans = x + y;
					push(ans);
				}
				if (c == '-') {
					if (x < y) {
						ans = y - x;
						push(ans);
					} else {
						ans = x - y;
						push(ans);
					}
				}
			}
			if (c == '\0') {
				while (!isEmpty()) {
					valEx = pop();
				}
			}
			i++;
		}
		return valEx;
	}
}
