package lab6_by_Van_Toan;

import java.util.Random;

public class ArrayQueue<T> implements Queue<T> {
	private static final int DEFAULT_CAPACITY = 10;
	private int count, maxQueueSize, queueFront, queueRear;
	private T[] A;

	public ArrayQueue() {
		maxQueueSize = DEFAULT_CAPACITY;
		A = (T[]) new Object[DEFAULT_CAPACITY];
		queueFront = 0;
		queueRear = -1;
	}

	public boolean isFull() {
		return count == maxQueueSize;
	}

	@Override
	public boolean isEmpty() {
		return count == 0;
		// return queueFront == -1;
	}

	@Override
	public void enqueue(T e) {
		if (isFull())
			doubleSize();
		queueRear++;
		A[queueRear % maxQueueSize] = e;
		count++;

	}

	private void doubleSize() {
		A = (T[]) new Object[2 * maxQueueSize];

	}

	public void moveNthFront(int n) {
		// test 1:
		/*
		 * if (!isEmpty()) { for (int i = 0; i < n; i++) { T tempVal; tempVal =
		 * (T) A[i]; A[i] = A[n - 1]; A[n - 1] = (T) tempVal; } }
		 */
		// test 2
		T temp = A[n - 1];
		for (int i = n - 1; i > queueFront; i--) {
			A[i] = A[i - 1];
		}
		A[queueFront] = temp;
	}

	@Override
	public T getFront() throws QueueException {
		if (isEmpty())
			throw new QueueException("Queue entry");
		return A[queueFront];
	}

	@Override
	public T dequeue() throws QueueException {
		T e = getFront();
		A[queueFront % maxQueueSize] = null;
		queueFront++;
		count--;
		return e;
	}

	@Override
	public void clear() {
		for (int i = 0; i < maxQueueSize; i++) {
			A[i] = null;
		}
		count = 0;
		queueRear = -1;
		queueFront = 0;
	}

	@Override
	public String toString() {
		StringBuilder output = new StringBuilder();
		if (isEmpty())
			output.append("[ ]");
		for (int i = 0; i < maxQueueSize; i++) {
			if (A[i] != null)
				output.append(A[i] + " ");
		}
		return output.toString();
	}
}
