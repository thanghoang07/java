package lab5_by_Van_Toan;

import lab5_by_Van_Toan.StackException;

public class ArrayStack<T> implements StackInterface<T> {

	public static final int DEFAULT_CAPACITY = 15;
	private int top;
	private T[] A;

	public ArrayStack(int initialCapacity) {
		if (initialCapacity <= 0)
			A = (T[]) new Object[DEFAULT_CAPACITY];
		else
			A = (T[]) new Object[initialCapacity];
		top = -1;
	}

	@Override
	public int size() {
		return (top + 1);
	}

	@Override
	public boolean isEmpty() {
		return top == -1;
	}

	@Override
	public T top() throws StackException {
		if (isEmpty())
			throw new StackException("Stack is empty");
		return A[top];
	}

	@Override
	public void push(T e) {
		if (top == A.length)
			throw new StackException("Stack has overflowed");
		top++;
		A[top] = e;
	}

	@Override
	public T pop() throws StackException {
		T x = peek();
		A[top] = null;
		top--;
		return x;
	}

	public void clear() {
		for (int i = 0; i <= top; i++)
			A[i] = null;
		top = -1;
	}

	public T peek() {
		if (isEmpty())
			throw new StackException("Stack is empty");
		return A[top];
	}

	// dao xau ki tu , dao chuoi dung stack
	public void daoMang(ArrayStack<T> stack) {
		T tmp = stack.peek();
		while (!stack.isEmpty()) {
	         stack.push(tmp);
	     }
	}

//	@Override
//	public String toString() {
//		String output = "";
//		for (int i = top; i >= 0; i--) {
//
//			if (A[i] != null)
//				output += "[ " + A[i] + " ]";
//		}
//		return output;
//	}
	
	@Override
	public String toString() {
		if (isEmpty()) {
			return "Stack is Empty";
		}
		StringBuilder st = new StringBuilder();
		for (int i = top; i > 0; i--)
			st.append(this.A[i] + "\t");
		st.append(this.A[0]);
		return "[ " + st + " ]";
	}
}
