package lab6_queue_by_thang_hoang;

public class ArrayQueue<T> implements QueueInterface<T>
{
	private static final int ADS = 10;
	private int maxQueueSize, count = 0, queueFront, queueRear;
	private T[] Mang;
	public ArrayQueue()
	{
		maxQueueSize = ADS;
		Mang = (T[]) new Object[ADS];
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
			Mang[i] = null;
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
		Mang[queueRear % maxQueueSize] = value;
		count++;
	}

	public void doubleSize() {
		Mang = (T[]) new Object[2 * ADS];		
	}
	@Override
	public T dequeue() throws QueueException {
		T e = getFront();
		Mang[queueFront % maxQueueSize] = null;
		queueFront++;
		count--;
		return e;
	}
	public T getFront() throws QueueException {
		if(isEmpty())
			return null;
		return Mang[0];
	}
	public String toString()
	{
		StringBuilder out = new StringBuilder();
		if(isEmpty())
			out.append("||");
		for (int i = 0; i < maxQueueSize; i++)
		{
			if (Mang[i] != null)
				out.append("|" + Mang[i] + "|");
		}
		return "|" + out.toString() + "|";		
	}
	public void move(int n)
	{
		T temp = Mang[n - 1];
		for (int i = n - 1; i > queueFront; i--)
		{
			Mang[i] = Mang[i - 1];
		}
		Mang[queueFront] = temp;
	}
}
