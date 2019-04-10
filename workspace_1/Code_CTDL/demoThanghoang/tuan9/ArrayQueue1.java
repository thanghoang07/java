package tuan9;

import java.io.ObjectInputStream.GetField;

public class ArrayQueue1<T> implements
	QueueInterface<T>
{
	private static final int ADS = 10;
	private int maxQueueSize,
		count = 0,
		queueFront,
		queueRear;
	private T[] A;
	public ArrayQueue1()
	{
		maxQueueSize = ADS;
		A = (T[]) new Object[ADS];
		queueRear = -1;
		queueFront = 0;
	}
	@Override
	public int size() {
		return count;
	}

	@Override
	public boolean isEmpty()
	{
		return count == 0;
	}

	@Override
	public boolean isFull()
	{		
		return count == maxQueueSize;
	}

	@Override
	public void clear()
	{
		for (int i = 0; i < maxQueueSize; i++) 
		{
			A[i] = null;
		}
		count = 0;
		queueRear = -1;
		queueFront = 0;
	}

	@Override
	public void enqueue(T value) {
		if(isFull())
			doubleSize();
		queueRear++;
		A[queueRear % maxQueueSize] = value;
		count++;
	}

	public void doubleSize() {
		A = (T[]) new Object[2 * ADS];		
	}
	@Override
	public T dequeue() throws QueueException {
		T e = getFront();
		A[queueFront % maxQueueSize] = null;
		queueFront++;
		count--;
		return e;
	}
	public T getFront() throws QueueException {
		if(isEmpty())
			return null;
		return A[0];
	}
	public String toString()
	{
		StringBuilder out = new StringBuilder();
		for (int i = 0; i < maxQueueSize; i++)
		{
			if (A[i] != null)
				out.append(A[i]);
		}
		return "|" + out.toString() + "|";		
	}
}
