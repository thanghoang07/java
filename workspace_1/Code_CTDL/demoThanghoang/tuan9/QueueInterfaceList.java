package tuan9;

public interface QueueInterfaceList<T>
{
		public boolean isEmpty();
		public void enqueue(T e);
		public T getFront() throws QueueException;
		public T dequeue() throws QueueException;
		public void clear();
}
