package tuan9_by_van_toan;

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
		A = (T[]) new Object[2 * DEFAULT_CAPACITY];

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
		StringBuilder output = new StringBuilder(maxQueueSize);
		if (isEmpty())
			output.append("[ ]");
		for (int i = 0; i < maxQueueSize; i++) {
			if (A[i] != null)
				output.append(A[i] + " ");
		}
		return output.toString();
	}
}
