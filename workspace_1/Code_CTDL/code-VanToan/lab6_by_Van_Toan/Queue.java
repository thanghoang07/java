package lab6_by_Van_Toan;

public interface Queue<T> {

	public boolean isEmpty();

	public void enqueue(T e);

	public T getFront() throws QueueException;

	public T dequeue() throws QueueException;

	public void clear();
}
