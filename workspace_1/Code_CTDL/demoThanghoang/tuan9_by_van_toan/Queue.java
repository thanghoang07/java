package tuan9_by_van_toan;

public interface Queue<T> {

	public boolean isEmpty();

	public void enqueue(T e);

	public T getFront() throws QueueException;

	public T dequeue() throws QueueException;

	public void clear();
}
