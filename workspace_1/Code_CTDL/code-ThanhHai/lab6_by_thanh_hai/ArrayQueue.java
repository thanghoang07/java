package lab6_by_thanh_hai;

public class ArrayQueue<T> implements QueueInterface<T> {
	private static final int DEFAULT_CAPACITY = 50;
	private int maxQueueSize, count, // current number of elements
			queueFront, // front index
			queueRear; // back index
	private T[] A;

	public ArrayQueue() {
		maxQueueSize = DEFAULT_CAPACITY;
		A = (T[]) new Object[DEFAULT_CAPACITY];
		queueRear = -1;
		queueFront = 0;
	}

	public boolean isEmpty() {
		return (queueRear == queueFront) ? true : false;
		// return count ==0;
	}

	public boolean isFull() {
		int diff = queueRear - queueFront;
		if (diff == -1 || diff == (maxQueueSize - 1))
			return true;
		return false;
		// return count == maxQueueSize;
	}

	public void enqueue(T value) {
		if (isFull()) {
			doubleSize();
		}
		queueRear++;
		A[queueRear % maxQueueSize] = value;
		count++;
	}

	private void doubleSize() {
	}

	public T dequeue() throws QueueException {
		T e = getFront();
		A[queueFront % maxQueueSize] = null;
		queueFront++;
		count--;
		return e;

	}

	public T getFront() throws QueueException {

		return A[queueFront];
	}

	public void clear() {
		for (int i = 0; i < maxQueueSize; i++) {
			A[i] = null;
		}
		count = 0;
		queueRear = -1;
		queueFront = 0;
	}

	public int size() {
		return count;
	}

	public String toString() {
		StringBuilder stb = new StringBuilder();
		if (isEmpty()) {
			stb.append("Queue isEmpty");
		} else {
			stb.append("[");
			for (int i = queueFront; i < queueRear; i++)
				stb.append(A[i] + ", ");
			stb.append(A[queueRear] + "]");
		}
		return stb.toString();

	}
}
