package tuan9_by_van_toan;

import tuan9_by_van_toan.Node;

public class LinkedListQueue<T> implements Queue<T> {
	protected Node<T> head;
	protected Node<T> tail;
	protected int count;

	public LinkedListQueue() {
		head = null;
		tail = null;
		count = 0;
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public void enqueue(T e) {
		Node<T> oldTail = tail;
		tail = new Node<T>(e, null);
		if (isEmpty())
			head = tail;
		else
			oldTail.next = tail;
		count++;

	}

	@Override
	public T getFront() throws QueueException {
		if (isEmpty())
			throw new QueueException("Queue entry");
		return head.getData();
	}

	@Override
	public T dequeue() throws QueueException {
		if (isEmpty())
			throw new QueueException("Stack is emtry");
		T data = head.getData();
		head = head.next;
		count--;
		return data;
	}

	@Override
	public void clear() {
		head = tail = null;
		count = 0;

	}

	@Override
	public String toString() {
		StringBuilder output = new StringBuilder(count);
		Node<T> cur = head;
		if (isEmpty())
			return "[]";
		output.append("[ ");
		while (cur != null) {
			
			output.append(cur.getData() + " ");
			cur = cur.getNext();
		}
		return output + "]";
	}
}
