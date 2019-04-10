package lab6_by_thanh_hai;

import lab5_by_thanh_hai.StackException;

public class ArrayStack<T> {
	private static final int DEFAULT_CAPACITY = 15;
	private int top;
	private T[] A;

	public ArrayStack(int initialCapacity) {
		if (initialCapacity <= 0) {
			A = (T[]) new Object[DEFAULT_CAPACITY];
		} else {
			A = (T[]) new Object[initialCapacity];
		}
		top = -1;
	}

	public int size() {
		return (top + 1);
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public T top() throws StackException {
		if (isEmpty()) {
			throw new StackException("Stack is empty");
		}
		return A[top];
	}

	public void push(T emlement) {
		if (top == A.length)
			throw new StackException("Stack has overflowed");
		top++;
		A[top] = emlement;
	}

	public T peek() {
		if (isEmpty()) {
			throw new StackException("Stack is empty");
		}
		return A[top];
	}

	public T pop() throws StackException {
		T x = peek();
		A[top] = null;
		top--;
		return x;
	}

	public void clear() {
		for (int i = 0; i <= top; i++) {
			A[i] = null;
			top = -1;
		}

	}

	public String toString() {
		StringBuilder stb = new StringBuilder();
		stb.append("[");
		for (int i = size() - 1; i >= 1; i--)
			stb.append(A[i] + " , ");
		stb.append(A[0] + "]");
		return stb.toString();

	}
}
