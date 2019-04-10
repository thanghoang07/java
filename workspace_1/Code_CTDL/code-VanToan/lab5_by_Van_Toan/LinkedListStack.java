package lab5_by_Van_Toan;

import lab3_by_Van_Toan.Node;
import lab6_by_Van_Toan.QueueException;

public class LinkedListStack<T> implements StackInterface<T> {
	protected Node<T> top;
	protected int size;

	public LinkedListStack() {
		top = null;
		size = 0;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return top == null;
	}

	@Override
	public T top() throws QueueException {
		if (isEmpty())
			throw new QueueException("Strack is emtry");
		return top.getData();
	}

	@Override
	public void push(T data) {
		top = new Node<T>(data, top);
		size++;
	}

	@Override
	/*
	 * lay gia tri cua top va xoa top
	 */
	public T pop() throws QueueException {
		if (isEmpty())
			throw new QueueException("Stack is emtry");
		T data = top.getData();
		top = top.next;
		size--;
		return data;
	}

	@Override
	public void clear() {
		top = null;
		size = 0;

	}

	// lay gia tri cua top
	public T peek() {
		if (isEmpty())
			throw new QueueException("Stack is emtry");
		return top.getData();
	}

	@Override
	public String toString() {
		String output = "[ ";
		Node<T> cur = top;
		if (isEmpty())
			return "[]";
		while (cur != null) {
			output += cur.getData() + " ";
			cur = cur.getNext();
		}
		return output + "]";
	}
	
}
