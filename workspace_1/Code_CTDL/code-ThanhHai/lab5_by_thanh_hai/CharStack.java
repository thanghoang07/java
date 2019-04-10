package lab5_by_thanh_hai;

import java.util.Scanner;

public class CharStack {
	private char[] stackArray;
	private int topOfStack;
	private static int counter;

	public CharStack(int capacity) { // (2)
		stackArray = new char[capacity];
		topOfStack = -1;
		counter++;
	}

	public void push(char e) {
		stackArray[++topOfStack] = e;
	}

	public char pop() {
		return stackArray[topOfStack--];
	}

	public char peek() {
		return stackArray[topOfStack];
	}

	public boolean isEmpty() {
		return topOfStack < 0;
	}

	public boolean isFull() {
		return (topOfStack == stackArray.length - 1);
	}
		
	
}
